package com.nvke.catalogQuery.controller;

import com.nvke.catalogQuery.bean.Catalog;
import com.nvke.catalogQuery.bean.Staff;
import com.nvke.catalogQuery.mapper.a.CatalogMapper;
import com.nvke.catalogQuery.mapper.b.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;
import java.util.Map;


@Controller
public class CatalogController {
    @Autowired
    CatalogMapper catalogMapper;
    @Autowired
    StaffMapper staffMapper;

    //登录校验 + 图书目录返回
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session, Model model){
        //登录成功,返回对应的catalog页面
        Staff staff = staffMapper.getStaffByUNPW(username, password);
        if (staff != null){
            session.setAttribute("loginUser",username);
            List<Catalog> catalogs = catalogMapper.getCatalogByQuertId(staff.getStaffQl_id());
            model.addAttribute("catalogs",catalogs);
            System.out.println(catalogs);
            return "catalog";
        }else {
            //登录失败
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }
    
    //插入图书目录
    @ResponseBody
    @GetMapping("/catalog")
    public Catalog insertCatalog(Catalog catalog){
        catalogMapper.insertCatalog(catalog);
        return catalog;
    }
}

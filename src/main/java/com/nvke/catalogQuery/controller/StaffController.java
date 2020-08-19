package com.nvke.catalogQuery.controller;

import com.nvke.catalogQuery.bean.Staff;
import com.nvke.catalogQuery.mapper.b.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class StaffController {

    @Autowired
    StaffMapper staffMapper;

    //添加员工信息
    @GetMapping("/staff")
    public Staff insertStaff(Staff staff){
        staffMapper.insertstaff(staff);
        return staff;
    }
}

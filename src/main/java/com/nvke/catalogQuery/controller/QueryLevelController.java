package com.nvke.catalogQuery.controller;

import com.nvke.catalogQuery.bean.QueryLevel;
import com.nvke.catalogQuery.mapper.a.QueryLevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class QueryLevelController {
    @Autowired
    QueryLevelMapper queryLevelMapper;

    //插入等级信息
    @GetMapping("/queryLevel")
    public QueryLevel insertQueryLevel(QueryLevel queryLevel){
        queryLevelMapper.insertQueryLevel(queryLevel);
        return queryLevel;
    }
}

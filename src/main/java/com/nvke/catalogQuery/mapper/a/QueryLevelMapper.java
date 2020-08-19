package com.nvke.catalogQuery.mapper.a;

import com.nvke.catalogQuery.bean.QueryLevel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface QueryLevelMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id")//useGeneratedKeys是不是使用自动生成的组件，并指明哪个属性是封装组件的
    @Insert("insert into queryLevel(levelName) values(#{levelName})")
    public int insertQueryLevel(QueryLevel queryLevel);
}

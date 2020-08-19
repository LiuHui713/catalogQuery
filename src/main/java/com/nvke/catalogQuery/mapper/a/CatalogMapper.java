package com.nvke.catalogQuery.mapper.a;

import com.nvke.catalogQuery.bean.Catalog;
import com.nvke.catalogQuery.bean.Staff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CatalogMapper {

    //通过传入的查询id，查询对应的目录列表
    @Select("select * from catalog where ql_id=#{ql_id}")
    public List<Catalog> getCatalogByQuertId(int ql_id);

    @Options(useGeneratedKeys = true,keyProperty = "bookId")//useGeneratedKeys是不是使用自动生成的组件，并指明哪个属性是封装组件的
    @Insert("insert into catalog(bookName,ql_id) values(#{bookName},#{ql_id})")
    public int insertCatalog(Catalog catalog);

}

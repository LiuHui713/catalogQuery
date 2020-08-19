package com.nvke.catalogQuery.mapper.b;

import com.nvke.catalogQuery.bean.Staff;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StaffMapper {

    //通过登录时的用户名、密码，查询该staff
    @Select("select * from staff where username=#{username} and password=#{password}")
    public Staff getStaffByUNPW(String username,String password);

    @Options(useGeneratedKeys = true,keyProperty = "staffId")//useGeneratedKeys是不是使用自动生成的组件，并指明哪个属性是封装组件的
    @Insert("insert into staff(username,password,staffQl_id) values(#{username},#{password},#{staffQl_id})")
    public int insertstaff(Staff staff);
}

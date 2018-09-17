package com.example.mutidb.dao.slave;

import com.example.mutidb.bean.UserSlave;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserSlaveDao {

    List<UserSlave> list();

    int count();

    @Select("select * from t_user t where t.id = #{id}")
    UserSlave getById(Long id);
}

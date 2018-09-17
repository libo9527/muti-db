package com.example.mutidb.dao.master;

import com.example.mutidb.bean.UserMaster;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMasterDao {

    List<UserMaster> list();

    int count();

    @Select("select * from t_user t where t.id = #{id}")
    UserMaster getById(Long id);
}

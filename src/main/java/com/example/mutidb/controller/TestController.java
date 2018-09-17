package com.example.mutidb.controller;

import com.example.mutidb.bean.UserMaster;
import com.example.mutidb.bean.UserSlave;
import com.example.mutidb.dao.master.UserMasterDao;
import com.example.mutidb.dao.slave.UserSlaveDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试controller
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserMasterDao userMasterDao;
    @Autowired
    private UserSlaveDao userSlaveDao;

    /**
     * 仅仅是一个demo，这里就不写service等类了，直接上dao了
     */
    @GetMapping
    public Map<String, Object> test1() {
        Map<String, Object> map = new HashMap<>();
        List<UserMaster> list = userMasterDao.list();
        int count = userMasterDao.count();

        log.info("db_a中t_user, 数据 count = {}, {}", count, list);
        log.info("db_a中t_user, id = 1 : {}", userMasterDao.getById(1L));

        List<UserSlave> list1 = userSlaveDao.list();
        int count1 = userSlaveDao.count();

        log.info("db_b中t_user, 数据 count = {}, {}", count1, list1);
        log.info("db_b中t_user, id = 3 : {}", userSlaveDao.getById(3L));

        map.put("db_a库t_user数据数", count);
        map.put("db_b库t_user数据数", count1);

        return map;
    }
}

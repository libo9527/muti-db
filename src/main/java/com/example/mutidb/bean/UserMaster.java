package com.example.mutidb.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/9/17:14:22
 */
@Data
public class UserMaster implements Serializable {
    private static final long serialVersionUID = 2539064156797116767L;
    private Long id;
    private String name;
}

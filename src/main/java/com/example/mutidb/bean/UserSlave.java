package com.example.mutidb.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserSlave implements Serializable {
    private static final long serialVersionUID = 1738998236475421604L;
    private Long id;
    private String name;
}

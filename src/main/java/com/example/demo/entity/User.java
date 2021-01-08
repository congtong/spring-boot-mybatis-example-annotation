package com.example.demo.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @author tc
 * @createTime 08 10:04
 * @description
 */
@Data
public class User {
    private String id;
    private String loginName;
    private String password;
    private String salt;
    private String myname;
    private int userType;
    private String userCode;
    private String phone;
    private String mobile;
    private String address;
    private String photo;
    private String loginIP;
    private Date loginDateTime;
    private String status;
    private String email;
    private byte isEnable;
    private byte deleteFlag;
    private String createUserID;
    private Date createDateTime;
    private String updateUserID;
    private Date updateDateTime;
    private String remarks;
    private byte sex;
    private String weChatId;
    private String nailId;
}

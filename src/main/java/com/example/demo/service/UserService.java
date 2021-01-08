package com.example.demo.service;

import com.example.demo.entity.PageRequest;
import com.example.demo.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {
    public PageInfo<User> getPageInfo(PageRequest pageRequest);
}

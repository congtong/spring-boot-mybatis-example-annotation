package com.example.demo;

import com.example.demo.entity.PageRequest;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tc
 * @createTime 08 10:12
 * @description
 */
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @RequestMapping("get")
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @RequestMapping("page")
    public Object getPage(@RequestBody PageRequest pageQuery) {
        return userService.getPageInfo(pageQuery);
    }
}

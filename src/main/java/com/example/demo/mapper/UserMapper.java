package com.example.demo.mapper;

import com.example.demo.entity.PageRequest;
import com.example.demo.entity.User;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author tc
 * @createTime 08 10:09
 * @description
 */
public interface UserMapper {
    @Select("select * from sys_user")
    @Results({
            @Result(property = "myname", column = "name")
    })
    List<User> getAll();
}

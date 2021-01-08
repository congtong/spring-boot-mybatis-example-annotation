package com.example.demo.entity;

import lombok.Data;

/**
 * @author tc
 * @createTime 08 10:24
 * @description
 */
@Data
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
}

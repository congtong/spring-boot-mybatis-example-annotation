package com.example.demo.utils;

import com.example.demo.entity.PageRequest;
import com.example.demo.entity.PageResult;
import com.github.pagehelper.PageInfo;

/**
 * @author tc
 * @createTime 08 10:29
 * @description
 */
public class PageUtils {

    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param page
     * @return
     */
    public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
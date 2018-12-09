package com.imooc.sell.model.dao;

import com.imooc.sell.model.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * created by yingchuanfu on 2018/12/9 20:34
 */
public class ProductCategory {

    @Autowired
    ProductCategoryMapper categoryMapper;

    public int insertBymap(Map<String, Object> map){
        return categoryMapper.insertBymap(map);
    }
}

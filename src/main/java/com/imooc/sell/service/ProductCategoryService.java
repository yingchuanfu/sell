package com.imooc.sell.service;

import com.imooc.sell.model.ProductCategory;

import java.util.List;

/**
 * Created by yingchuanfu on 2018/11/21 0021.
 */
public interface ProductCategoryService {
    ProductCategory fineOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> cateTypeList);

    ProductCategory save(ProductCategory productCategory);
}

package com.imooc.sell.service.impl;

import com.imooc.sell.model.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yingchuanfu on 2018/11/21 0021.
 */
@Service
public class ProductCategoryServiceImpl implements com.imooc.sell.service.ProductCategoryService {
    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public ProductCategory fineOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> cateTypeList) {
        return repository.findByCategoryTypeIn(cateTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}

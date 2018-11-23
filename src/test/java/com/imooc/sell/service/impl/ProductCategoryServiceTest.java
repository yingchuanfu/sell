package com.imooc.sell.service.impl;

import com.imooc.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yingchuanfu on 2018/11/21 0021.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceTest {
    @Autowired
    private ProductCategoryServiceImpl categoryService;
    @Test
    public void fineOne() throws Exception {
        ProductCategory productCategory = categoryService.fineOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3));
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("冰琪琳",3);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}
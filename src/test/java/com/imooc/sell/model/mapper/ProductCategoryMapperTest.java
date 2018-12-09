package com.imooc.sell.model.mapper;

import com.imooc.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * created by yingchuanfu on 2018/12/9 19:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper categoryMapper;

    @Test
    public void insertBymap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "热销榜");
        map.put("category_type", 9);
        map.put("create_time", new Date());
        map.put("update_time", new Date());
        int result = categoryMapper.insertBymap(map);
        Assert.assertEquals(1, result);
    }

    @Test
    public void insertByObject(){
        ProductCategory category = new ProductCategory();
        category.setCategoryName("招牌菜");
        category.setCategoryType(10);
        int result = categoryMapper.insertByObject(category);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findByCategoryType(){
        ProductCategory result = categoryMapper.findByCategoryType(8);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryName(){
        List<ProductCategory> categoryList = categoryMapper.findByCategoryName("川菜");
        Assert.assertEquals(0, categoryList.size());
    }

    @Test
    public void updateByCategoryType(){
        int result = categoryMapper.updateByCategoryType("川菜", 2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void updateByObject(){
        ProductCategory category = new ProductCategory();
        category.setCategoryName("川菜");
        category.setCategoryType(10);
        int result = categoryMapper.insertByObject(category);
        Assert.assertEquals(1, result);

    }

    @Test
    public void deleteByCategoryType(){
        int result = categoryMapper.deleteByCategorType(10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void selectByCategoryType(){
        ProductCategory category = categoryMapper.selectByCategoryType(8);
        Assert.assertNotNull(category);
    }
}
package com.imooc.sell.model.mapper;

import com.imooc.sell.model.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * created by yingchuanfu on 2018/12/9 19:33
 */
public interface ProductCategoryMapper {

    @Insert("insert into product_category(category_name,category_type,create_time,update_time)" +
            " values(#{category_name, jdbcType=VARCHAR},#{category_type,jdbcType=INTEGER}," +
            "#{create_time,jdbcType=TIMESTAMP}, #{update_time,jdbcType=TIMESTAMP})")
    int insertBymap(Map<String, Object> map);

    @Insert("insert into product_category(category_name,category_type,create_time,update_time)" +
            " values(#{categoryName, jdbcType=VARCHAR},#{categoryType,jdbcType=INTEGER}," +
            "#{create_time,jdbcType=TIMESTAMP}, #{update_time,jdbcType=TIMESTAMP})")
    int insertByObject(ProductCategory productCategory);

    @Select("select * from product_category where category_type = #{categoryType}")
    @Results(value = {
            @Result(column = "category_id", property = "categroyId"),
            @Result(column = "category_name", property = "categoryName"),
            @Result(column = "category_type", property = "categoryType")
    })
    ProductCategory findByCategoryType(Integer categoryType);

    @Select("select * from product_category where categoryName = #{categoryName}")
    @Results(value = {
            @Result(column = "category_id", property = "categroyId"),
            @Result(column = "category_name", property = "categoryName"),
            @Result(column = "category_type", property = "categoryType")
    })
    List<ProductCategory> findByCategoryName(String categoryName);

    @Update("update product_category set category_name = #{categoryType} where category_type =#{categoryType}")
    int updateByCategoryType(@Param("categoryName") String categoryName,@Param("categoryType") Integer categoryType );

    @Update("update product_category set category_name = #{categoryType} where category_type =#{categoryType}")
    int updateByObject(ProductCategory category);

    @Delete("delete from product_category where category_type =#{categoryType}")
    int deleteByCategorType(Integer categoryType);

    /**
     * 使用mybatis xml
     *
     */
    ProductCategory selectByCategoryType(Integer categoryType);















}

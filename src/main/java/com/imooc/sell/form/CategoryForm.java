package com.imooc.sell.form;

/**
 * created by yingchuanfu on 2018/12/8 13:20
 */
public class CategoryForm {

    private Integer categoryId;
    /** 类目编名字 */
    private String categoryName;
    /** 类目编号 */
    private Integer categoryType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}

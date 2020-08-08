package com.imooc.sell.form;

import lombok.Data;

/**
 * created by yingchuanfu on 2018/12/8 13:20
 */
@Data
public class CategoryForm {

    private Integer categoryId;
    /** 类目编名字 */
    private String categoryName;
    /** 类目编号 */
    private Integer categoryType;
}

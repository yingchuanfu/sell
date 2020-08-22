package com.imooc.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * created by yingchuanfu on 2018/12/8 11:04
 */
@Data
public class ProductForm {

    private String productId;
    /** 商品名称 */
    private String productName;
    /** 商品价格 */
    private BigDecimal productPrice;
    /** 库存 */
    private Integer productStock;
    /** 描述 */
    private String productDescription;
    /** 图片 */
    private String productIcon;
    /** 状态:0正常,1下架 */
   // private Integer productStatus;
    /** 类目编号 */
    private Integer categoryType;
}

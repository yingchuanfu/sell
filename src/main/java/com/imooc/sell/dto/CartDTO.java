package com.imooc.sell.dto;

import lombok.Data;

/**购物车
 * Created by yingchuanfu on 2018/11/27 0027.
 */
@Data
public class CartDTO {
    /**商品 Id*/
    private String productId;
    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

package com.imooc.sell.enums;

/**
 * 商品状态
 * Created by yingchuanfu on 2018/11/22 0022.
 */
public enum ProductStatusEnum implements CodeEnum{
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

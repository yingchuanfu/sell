package com.imooc.sell.enums;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
public enum ResultEnum {
    PRODUCT_NOT_EXIST(0, "商品不存在");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
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

package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}

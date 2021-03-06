package com.imooc.sell.enums;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
public enum ResultEnum {
    SUCCESS(200, "成功"),
    PARAM_ERROR(-1, "参数不正确"),
    PRODUCT_NOT_EXIST(0, "商品不存在"),
    PRODUCT_STOCK_ERROR(1, "商品库存不足"),
    ORDER_NOT_EXIT(2, "订单不存在"),
    ORDERDETAIL_NOT_EXIT(3, "订单详情不存在"),
    ORDER_STATUS_ERROR(4, "订单状态不正确"),
    ORDER_UPDATE_FAIL(5, "订单更新失败"),
    ORDER_DETAIL_EMPTY(6, "订单无商品详情"),
    ORDER_PAY_STATUS_ERROR(7, "订单支付状态不正确"),
    CART_EMPTY(8, "购物车为空"),
    ORDER_OWNER_ERROR(9, "该订单不属于当前用户"),
    WECHAT_MP_ERROR(10, "微信公众号相关错误"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(11, "微信支付异步通知金额校验不通过"),
    ORDER_FINISH_SUCCESS(12, "订单完结成功"),
    PRODUCT_STATUS_ERROR(13, "商品状态不正确"),
    LOGIN_FAIL(14, "登录失败"),
    LOGOUT_SUCCESS(15, "退出成功")
            ;
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

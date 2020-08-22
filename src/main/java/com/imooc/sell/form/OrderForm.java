package com.imooc.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**表单验证
 * Created by yingchuanfu on 2018/12/1 0001.
 */
@Data
public class OrderForm {

    /** 买家姓名*/
    @NotEmpty(message = "姓名必填")
    private String name;

    /** 买家手机号*/
    @NotEmpty(message = "手机号必填")
    private String phone;

    /** 买家微信openid*/
    /** 买家地址 */
    @NotEmpty(message = "买家地址")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    /** 买家购物车 */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}

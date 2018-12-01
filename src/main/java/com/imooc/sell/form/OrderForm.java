package com.imooc.sell.form;

import org.hibernate.validator.constraints.NotEmpty;

/**表单验证
 * Created by yingchuanfu on 2018/12/1 0001.
 */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

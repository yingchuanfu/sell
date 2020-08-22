package com.imooc.sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * created by yingchuanfu on 2018/12/8 15:46
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String userName;

    private String password;

    private String openid;

}

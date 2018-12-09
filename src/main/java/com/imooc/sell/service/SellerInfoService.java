package com.imooc.sell.service;

import com.imooc.sell.model.SellerInfo;

/**
 * created by yingchuanfu on 2018/12/8 16:25
 */
public interface SellerInfoService {

    SellerInfo findSerllerInfoByOpenid(String openid);
}

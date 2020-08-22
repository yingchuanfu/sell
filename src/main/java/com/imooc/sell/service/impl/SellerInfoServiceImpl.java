package com.imooc.sell.service.impl;

import com.imooc.sell.model.SellerInfo;
import com.imooc.sell.repository.SellerInfoRepository;
import com.imooc.sell.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by yingchuanfu on 2018/12/8 16:26
 */
@Service
public class SellerInfoServiceImpl implements SellerInfoService{

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Override
    public SellerInfo findSerllerInfoByOpenid(String openid) {
        return sellerInfoRepository.findByOpenid(openid);
    }
}

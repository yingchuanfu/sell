package com.imooc.sell.repository;

import com.imooc.sell.model.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by yingchuanfu on 2018/12/8 15:49
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {

    SellerInfo findByOpenid(String openid);
}

package com.imooc.sell.service.impl;

import com.imooc.sell.model.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * created by yingchuanfu on 2018/12/8 16:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoServiceImplTest {

    private static final String openid = "oD97T1FN81n-hgeE5RoyBOgkDwN8";

    @Autowired
    private SellerInfoServiceImpl sellerInfoService;

    @Test
    public void findSerllerInfoByOpenid() throws Exception {
        SellerInfo result = sellerInfoService.findSerllerInfoByOpenid(openid);
        Assert.assertEquals(openid, result.getOpenid());
    }

}
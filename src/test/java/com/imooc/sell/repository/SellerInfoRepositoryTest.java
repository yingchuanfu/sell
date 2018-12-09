package com.imooc.sell.repository;

import com.imooc.sell.model.SellerInfo;
import com.imooc.sell.util.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * created by yingchuanfu on 2018/12/8 15:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Test
    public void save(){
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.getUniqueKey());
        sellerInfo.setUserName("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("oD97T1FN81n-hgeE5RoyBOgkDwN8");
        SellerInfo result = sellerInfoRepository.save(sellerInfo);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOpenid() throws Exception {
        SellerInfo result = sellerInfoRepository.findByOpenid("oD97T1FN81n-hgeE5RoyBOgkDwN8");
        Assert.assertEquals("oD97T1FN81n-hgeE5RoyBOgkDwN8",
                result.getOpenid());
    }

}
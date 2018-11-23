package com.imooc.sell.repository;

import com.imooc.sell.model.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Date;

import static org.junit.Assert.*;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;
    private final String OPENID = "oD97T1FN81n-hgeE5RoyBOgkDwN8";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("124");
        orderMaster.setBuyerName("mister zhang");
        orderMaster.setBuyerPhone("15322623356");
        orderMaster.setBuyerAddress("产业基地");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(5.3));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request = new PageRequest(1, 2);
        Page<OrderMaster> orderMasterPage = repository.findByBuyerOpenid(OPENID, request);
        Assert.assertNotEquals(0,orderMasterPage.getTotalElements());
        System.out.println(orderMasterPage);
    }

}
package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.OrderMasterService;
import com.imooc.sell.service.PayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * created by yingchuanfu on 2018/12/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderMasterService orderMasterService;
    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne("");
        //调试配置
       // OrderDTO orderDTO = new OrderDTO();
        payService.create(orderDTO);
    }

}
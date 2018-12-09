package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.OrderMasterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * created by yingchuanfu on 2018/12/9 16:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessgeServiceImplTest {

    @Autowired
    private PushMessgeServiceImpl pushMessgeService;

    @Autowired
    private OrderMasterService orderMasterService;

    @Test
    public void orderStatus() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne("");
        pushMessgeService.orderStatus(orderDTO);
    }

}
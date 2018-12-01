package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.model.OrderDetail;
import com.imooc.sell.model.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import sun.dc.pr.PRError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yingchuanfu on 2018/11/27 0027.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterServiceImplTest {
    private static final Logger logger = LoggerFactory
            .getLogger(OrderMasterServiceImplTest.class);
    @Autowired
    private OrderMasterServiceImpl orderMasterService;
    private final String BUYER_OPENID = "1101111";
    private final String ORDER_ID = "1543323259806812697";
    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("ying");
        orderDTO.setBuyerAddress("深圳湾");
        orderDTO.setBuyerPhone("13522523352");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("124");
        orderDetail.setProductQuantity(1);

        OrderDetail o2 = new OrderDetail();
        o2.setProductId("125");
        o2.setProductQuantity(2);

        orderDetailList.add(orderDetail);
        orderDetailList.add(o2);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderMasterService.create(orderDTO);
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        logger.info("【查询单个订单】 result={}", orderDTO.getOrderId());
        Assert.assertEquals(ORDER_ID, orderDTO.getOrderId());
    }

    @Test
    public void findList() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<OrderDTO> orderDTOPage = orderMasterService.findList(BUYER_OPENID, pageRequest);
        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        OrderDTO result = orderMasterService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(), result.getOrder_status());

    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        OrderDTO result = orderMasterService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), result.getOrder_status());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderMasterService.findOne(ORDER_ID);
        OrderDTO result = orderMasterService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(), result.getPayStatus());
    }

}
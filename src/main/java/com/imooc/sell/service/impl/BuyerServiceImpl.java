package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.ResultEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.service.BuyerService;
import com.imooc.sell.service.OrderMasterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yingchuanfu on 2018/12/1 0001.
 */
@Service
public class BuyerServiceImpl implements BuyerService {

    private static final Logger logger = LoggerFactory
            .getLogger(BuyerServiceImpl.class);
    @Autowired
    private OrderMasterService orderMasterService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        //OrderDTO orderDTO = checkOrderOwner(openid, orderId);
        return checkOrderOwner(openid, orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid, orderId);
        if (orderDTO == null){
            logger.error("【取消订单】查不到该订单,orderId={}", orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIT);
        }
        return orderMasterService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId){
        OrderDTO orderDTO = orderMasterService.findOne(orderId);
        if (orderDTO == null){
            return null;
        }
        //判断是否是自己的订单
        if (!orderDTO.getBuyerOpenid().equals(openid)){
            logger.error("【查询订单】订单的openid不一致,openid={}", openid);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}

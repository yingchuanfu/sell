package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 推送消息
 * created by yingchuanfu on 2018/12/9 16:02
 */
public interface PushMessgeService {
    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}

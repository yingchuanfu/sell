package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**买家
 * Created by yingchuanfu on 2018/12/1 0001.
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}

package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**支付
 * Created by yingchuanfu on 2018/12/4 0004.
 */
public interface PayService {
    public void create(OrderDTO orderDTO);

    public PayResponse notify(String notifyData);
}

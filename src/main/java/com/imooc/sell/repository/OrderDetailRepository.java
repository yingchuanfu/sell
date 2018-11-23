package com.imooc.sell.repository;

import com.imooc.sell.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{

    List<OrderDetail> findByOrderId(String orderId);
}

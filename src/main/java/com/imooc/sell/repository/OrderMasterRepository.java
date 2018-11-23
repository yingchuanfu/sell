package com.imooc.sell.repository;

import com.imooc.sell.model.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String>{
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}

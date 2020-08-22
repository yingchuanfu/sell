package com.imooc.sell.util;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.model.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by yingchuanfu on 2018/12/1 0001.
 */
public class Converter {
    private static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }
    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream()
                .map(e ->convert(e))
                .collect(Collectors.toList());
    }
}

package com.imooc.sell.model;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yingchuanfu on 2018/11/23 0023.
 */
@Data
@Entity
//下面注解需在pom.xml引入lombok依赖:@Getter实体类不用写get set方法 ;@DynamicUpdate动态更新数据库时间
//@Data
//@Getter
//@DynamicUpdate
public class OrderMaster {
    /** 订单id */
    @Id
    private String orderId;
    /** 买家名字 */
    private String buyerName;
    /** 买家手机号 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信Openid */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态:默认0为新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /** 支付状态:默认0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

    //@Transient 可以防止报错数据库没有此字段
   // private List<OrderDetail> orderDetailList;

}

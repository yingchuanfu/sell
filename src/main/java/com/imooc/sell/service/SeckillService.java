package com.imooc.sell.service;

/**
 * Created by yingchuanfu on 2018/12/10 0010 下午 17:51.
 */
public interface SeckillService {

    /**
     * 查询秒杀活动特价商品的信息
     * @param productId
     * @return
     */
    String querySeckillProductInfo(String productId);

    /**
     * 模拟不同用户秒杀同一商品的请求
     * @param productId
     */
    void oderProductMockDiffUser(String productId);
}

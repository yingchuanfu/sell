package com.imooc.sell.util;

import java.util.Random;

/**
 * Created by yingchuanfu on 2018/11/27 0027.
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     *  格式:时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer nuber = random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(nuber);
    }
}

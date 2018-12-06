package com.imooc.sell.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * created by yingchuanfu on 2018/12/6.21:37
 */
public class JsonUtil {

    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}

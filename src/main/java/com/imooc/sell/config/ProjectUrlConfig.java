package com.imooc.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * created by yingchuanfu on 2018/12/8 17:26
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /** 微信公众平台授权url */
    public String wechatMpAuthorize;

    /** 微信开放平台授权 */
    public String wechatOpenAuthorize;

    /** 点餐系统 */
    public String sell;
}

package com.imooc.sell.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * created by yingchuanfu on 2018/12/6.
 */
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccoutConfig {

    /** 公众平台id */
    private String mpAppId;
    /** 公众平台密钥 */
    private String mpAppSecret;
    /** 开放平台id */
    private String openAppId;
    /** 开放平台密钥 */
    private String openAppSecrte;
    /** 商户号 */
    private String mchId;
    /** 商户密钥 */
    private String mchKey;
    /** 商户证书路径 */
    private String keyPath;
    /** 微信支付异步通知地址 */
    private String notifyUrl;
    /** 微信模板id */
    private Map<String, Object> templateId;

    public Map<String, Object> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Map<String, Object> templateId) {
        this.templateId = templateId;
    }

    public String getOpenAppId() {
        return openAppId;
    }

    public void setOpenAppId(String openAppId) {
        this.openAppId = openAppId;
    }

    public String getOpenAppSecrte() {
        return openAppSecrte;
    }

    public void setOpenAppSecrte(String openAppSecrte) {
        this.openAppSecrte = openAppSecrte;
    }

    public String getMpAppId() {
        return mpAppId;
    }

    public void setMpAppId(String mpAppId) {
        this.mpAppId = mpAppId;
    }

    public String getMpAppSecret() {
        return mpAppSecret;
    }

    public void setMpAppSecret(String mpAppSecret) {
        this.mpAppSecret = mpAppSecret;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchKey() {
        return mchKey;
    }

    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}

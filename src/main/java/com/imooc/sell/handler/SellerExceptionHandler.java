//package com.imooc.sell.handler;
//
//import com.imooc.sell.config.ProjectUrlConfig;
//import com.imooc.sell.exception.SellerAuthorizeException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
///**
// * created by yingchuanfu on 2018/12/9 15:36
// */
//@ControllerAdvice
//public class SellerExceptionHandler {
//
//    @Autowired
//    private ProjectUrlConfig projectUrlConfig;
//
//
//    //拦截登录异常
//    //http://sqmax.natapp1.cc/sell/wechat/qrAuthorize?returnUrl=http://sqmax.natapp1.cc/sell/seller/login
//    @ExceptionHandler(value = SellerAuthorizeException.class)
//    public ModelAndView handlerAuthorizeException(){
//        return new ModelAndView("redirect:"
//        .concat(projectUrlConfig.getWechatOpenAuthorize())
//        .concat("/sell/wechat/qrAuthorize")
//        .concat("?returnUrl=")
//        .concat(projectUrlConfig.getSell())
//        .concat("/sell/seller/login"));
//    }
//
//
//}

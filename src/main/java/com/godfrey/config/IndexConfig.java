//package com.godfrey.config;
//
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.event.EventListener;
//
//import java.io.IOException;
//
///**
// * 启动默认跳转首页
// */
//@Configuration
//public class IndexConfig {
//    @EventListener({ApplicationReadyEvent.class})
//    void applicationReadyEvent() {
//        System.out.println("应用已经准备就绪 ... 启动浏览器");
//        String url = "http://localhost:8080/index";
//        Runtime runtime = Runtime.getRuntime();
//        try {
//            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

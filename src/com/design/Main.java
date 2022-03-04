package com.design;

import com.design.adapter.*;
import com.design.aop.AopBrowser;
import com.design.proxy.BroswerProxy;
import com.design.proxy.Browser;
import com.design.proxy.IBrowser;
import com.design.singleton.Aclazz;
import com.design.singleton.Bclazz;
import com.design.singleton.SocketClient;

import javax.sql.rowset.BaseRowSet;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
//	    Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//        IBrowser browser = new BroswerProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBroswer = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBroswer.show();
        System.out.println("loading time : " + end.get());

        aopBroswer.show();
        System.out.println("loading time : " + end.get());
    }

    
    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}

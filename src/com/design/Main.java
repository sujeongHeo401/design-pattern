package com.design;

import com.design.adapter.*;
import com.design.aop.AopBrowser;
import com.design.decorator.*;
import com.design.observer.Button;
import com.design.observer.IButtonListener;
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
        Button button = new Button("버튼");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click1");
        button.click("메시지 전달 : click2");
        button.click("메시지 전달 : click3");
        button.click("메시지 전달 : click4");
    }

    
    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}

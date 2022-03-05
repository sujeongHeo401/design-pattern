package com.design;

import com.design.adapter.*;
import com.design.aop.AopBrowser;
import com.design.decorator.*;
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
        ICar audi = new Audi(1000);
        audi.showPrice();
        //a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        //a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        //a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
    }

    
    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}

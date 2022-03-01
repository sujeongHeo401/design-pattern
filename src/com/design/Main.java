package com.design;

import com.design.adapter.*;
import com.design.singleton.Aclazz;
import com.design.singleton.Bclazz;
import com.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();


        System.out.println("두개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
        */

        HairDriver hairDriver = new HairDriver();
        connect(hairDriver);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);

        connect(adapter);


        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);

        connect(airAdapter);


    }

    
    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}

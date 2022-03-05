package com.design;

import com.design.adapter.*;
import com.design.aop.AopBrowser;
import com.design.decorator.*;
import com.design.facade.Ftp;
import com.design.facade.Reader;
import com.design.facade.SftpClient;
import com.design.facade.Writer;
import com.design.observer.Button;
import com.design.observer.IButtonListener;
import com.design.proxy.BroswerProxy;
import com.design.proxy.Browser;
import com.design.proxy.IBrowser;
import com.design.singleton.Aclazz;
import com.design.singleton.Bclazz;
import com.design.singleton.SocketClient;
import com.design.strategy.*;

import javax.sql.rowset.BaseRowSet;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        ///base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }

    
    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}

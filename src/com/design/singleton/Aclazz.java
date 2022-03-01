package com.design.singleton;

import java.net.Socket;

public class Aclazz {

    private SocketClient socketClient;


    public Aclazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}

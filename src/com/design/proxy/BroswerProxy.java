package com.design.proxy;

public class BroswerProxy implements IBrowser{

    private String url;
    private Html html;

    public BroswerProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {

        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from: " + url);
        }

        System.out.println("use cashe: " + url);

        return html;
    }
}

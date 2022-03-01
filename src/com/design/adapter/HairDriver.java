package com.design.adapter;

public class HairDriver implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110V on");
    }
}

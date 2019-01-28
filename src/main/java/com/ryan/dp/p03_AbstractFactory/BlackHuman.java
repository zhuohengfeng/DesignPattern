package com.ryan.dp.p03_AbstractFactory;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑人皮肤是黑色");
    }

    @Override
    public void talk() {
        System.out.println("我是黑人");
    }
}
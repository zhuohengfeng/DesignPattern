package com.ryan.dp.p02_FactoryMethod;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白人皮肤是白色");
    }

    @Override
    public void talk() {
        System.out.println("我是白人");
    }
}

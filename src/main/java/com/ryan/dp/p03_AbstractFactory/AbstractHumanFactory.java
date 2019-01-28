package com.ryan.dp.p03_AbstractFactory;

public abstract class AbstractHumanFactory {
    // 单独的T 代表一个类型 ，而 Class<T>代表这个类型所对应的类， Class<？>表示类型不确定的类
    // 这里输入参数类型可以自行设置，通常为String, Enum, Class等
    public abstract  <T extends Human> T createHuman(Class<T> c);
}

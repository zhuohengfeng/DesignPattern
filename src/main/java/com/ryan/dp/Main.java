package com.ryan.dp;

import com.ryan.dp.p02_FactoryMethod.*;

public class Main {

    public static void main(String[] args) {
        // 01 单例模式

        /** 02 工厂方法模式 */
        // 阴阳炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        Human whileHuman = YinYangLu.createHuman(WhiteHuman.class);
        whileHuman.getColor();
        whileHuman.talk();
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();













    }
}

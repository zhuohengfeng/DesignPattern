package com.ryan.dp.p02_FactoryMethod;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;

        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("创建人种错误");
        }

        return (T) human;
    }

    /**
     * 其实这里可以直接使用静态方法简化 ----- 这个就是简单工厂模式simple Factory Pattern。
     * 缺点是工厂类的扩展比较困难，不符合开闭原则
     */
//    public static <T extends Human> T createHuman(Class<T> c) {
//        Human human = null;
//
//        try {
//            human = (T) Class.forName(c.getName()).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("创建人种错误");
//        }
//
//        return (T) human;
//    }

}
package cn.dingwei.factory;

public class FactoryTest {
    public static void main(String[] args) {

        //Spring bean 来配置
        Factory factory = new MingJiFactory();
    System.out.println(factory.getXianShiQi().getName());
    }
}

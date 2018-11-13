package cn.dingwei.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new HpFactory();
        System.out.println(factory.getXianShiQi().getName());
    }
}

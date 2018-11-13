package cn.dingwei.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getXianShiQi("三星"));
    }
}

public class Test {
    public static void main(String[] args) {
        Integer a = 120;
        int b= 120;
        Integer c = 120;
        Integer d = new Integer(120);
        System.out.println(a == b);   //true    t1
        System.out.println(a == c);   //true    t2
        System.out.println(a == d);   //false   t3

        Integer e = 128;
        Integer f = 128;
        System.out.println(e == f);   //false    t4

    }
}

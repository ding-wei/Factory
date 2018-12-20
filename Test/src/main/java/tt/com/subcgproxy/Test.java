package tt.com.subcgproxy;

import tt.com.subject.Subject;

/**
 * Created by sc on 2018/11/5.
 */
public class Test {

//    public static void main(String[] args) {
//        Subject subject= (Subject) new ProxyForObserver().getInstance(Subject.class);
//        subject.add();
//    }

    Person person = new Person("Test");
    static{
        System.out.println("test static");
    }

    public Test() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}

class Person{
    static{
        System.out.println("person static");
    }
    public Person(String str) {
        System.out.println("person "+str);
    }
}


class MyClass extends Test {
    Person person = new Person("MyClass");
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }
}
package tt.com.subcgproxy;

import tt.com.subject.Subject;

/**
 * Created by sc on 2018/11/5.
 */
public class Test {

    public static void main(String[] args) {
        Subject subject= (Subject) new ProxyForObserver().getInstance(Subject.class);
        subject.add();
    }
}

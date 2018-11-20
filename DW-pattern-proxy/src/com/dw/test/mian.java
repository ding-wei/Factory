package com.dw.test;

import java.util.ArrayList;
import java.util.List;

public class mian {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("qqyumidi");
        list.add("corn");
        list.add(100);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String) {
                String name = (String) list.get(i); // 1
                System.out.println("name:" + name);
            }
            if (list.get(i) instanceof Integer) {
                Integer aa = (Integer) list.get(i); // 1
                System.out.println("name:" + aa);
            }

        }
        //List<?> list = new ArrayList<?>();
        List<?> aa = new ArrayList<Integer>();
        List<?> list1 = new ArrayList<>();
    }
}

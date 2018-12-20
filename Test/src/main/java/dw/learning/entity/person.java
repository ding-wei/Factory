package dw.learning.entity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class person<K,V> {
    public Hashtable<K,V> h=new Hashtable<K,V>();
    public void put(K k, V v) {
        h.put(k,v);
    }
    public V get(K k) {
        return h.get(k);
    }
    public static void main(String args[]){
        person<Integer,String> t=new person<Integer,String>();
        t.put(1, "value");
        String s=t.get(1);
        System.out.println(s);
    }
}

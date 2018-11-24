package com.dw.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ding.wei
 * 服务员:负责把相应的菜给相应的厨师
 */
public class Waiter {
    public Map<String, Cook> getCook = new HashMap<>();

    public Waiter() {
        getCook.put("炒菜", new CookA());
        getCook.put("油炸", new CookB());
        getCook.put("煮菜", new CookC());
    }

    public void order(String name) {
        getCook.get(name).cookDish();
    }
}

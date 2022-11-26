package org.example;

import java.util.HashMap;

public class HashMapStudy {
    public void testIntHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("test", "test string");
        String result = map.get("test");

        System.out.println(result);
    }
}

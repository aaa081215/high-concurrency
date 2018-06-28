package com.fc.Current.immutable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class immutableExample {
    private  static Map<Integer,Integer> map=new HashMap<>();
    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        Collections.unmodifiableMap(map);

    }

    public static void main(String[] args) {

        System.out.println(map.get(1));
    }
}

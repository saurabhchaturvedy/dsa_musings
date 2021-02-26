package com.dsa.saurabh.level01.MapKeyFinder;

import java.util.HashMap;
import java.util.Map;

public class MapKeyFinder {


    private static void findValuesIfKeysPresent(Map<Integer, Integer> map, int key) {
        if (map.get(key) != null) {
            System.out.println(map.get(key));
            findValuesIfKeysPresent(map, map.get(key));
        }

    }

    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        integerIntegerMap.put(2, 4);
        integerIntegerMap.put(6, 5);
        integerIntegerMap.put(4, 6);
        integerIntegerMap.put(5, 8);

        findValuesIfKeysPresent(integerIntegerMap, 2);
    }
}

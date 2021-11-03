package com.ghjkgf;


import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个数组和一个整数 target，可以保证数组中存在两个数的和为 target，请你返回这两个数的索引*/
public class TwoSum {
    Map<Integer, Integer> freq = new HashMap<>();

    public void add(int number) {
        // 记录 number 出现的次数
        freq.put(number, freq.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
        for (Integer key : freq.keySet()) {
            int other = value - key;
            // 情况一
            if (other == key && freq.get(key) > 1)
                return true;
            // 情况二
            if (other != key && freq.containsKey(other))
                return true;
        }
        return false;
    }
}

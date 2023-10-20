package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.stream.Collector;

public class Main {
    static void myMethod() {
        System.out.println("My Method");
    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("foo", "bar");

        String value = map.remove("foo");

        map.put("new_foo", value);

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(nums).);
        for (int i : nums) {
            set.add(i);
        }
        if (set.size() != nums.length) return true;
        return false;

    }
}
}

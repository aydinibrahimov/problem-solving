package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GoodPairs {
    public static void main(String[] args) {
        int count=0;
        int[] arr = {1, 2, 3, 1, 1, 3};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int a : arr) {
            list.add(a);
            set.add(a);
            map.put(String.valueOf(count), a);
            count++;
        }
        System.out.println(map.values());
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        System.out.println(set);

    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

        }
        return 0;

    }
}

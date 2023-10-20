package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {


    }


    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() != nums.length) return true;
        return false;

    }


}


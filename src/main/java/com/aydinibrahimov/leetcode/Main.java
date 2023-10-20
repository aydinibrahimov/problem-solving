package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {



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

package com.aydinibrahimov.leetcode;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.*;
import java.util.stream.Collectors;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};

        System.out.println(numIdenticalPairs(arr));

    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;

    }


}

package com.aydinibrahimov.leetcode;

import java.util.Arrays;

public class EmployeesWhoMetTarget {
    public static void main(String[] args) {

    }


    public static long numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return Arrays.stream(hours)
                .filter(h -> h >= target)
                .count();
    }
}

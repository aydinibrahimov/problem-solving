package com.aydinibrahimov.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GoalParser {
    public static void main(String... args) {
        Arrays.asList(args).stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static int getTotal(String... names) {
       return Arrays.stream(names)
               .parallel()
               .filter(name->name.length()>5)
               .mapToInt(String::length)
               .sum();

    }

    //LeecCode link -> https://leetcode.com/problems/richest-customer-wealth/
    //My LeetCode profile: https://leetcode.com/aydinibrahimov
    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int rich = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (rich < sum) rich = sum;
        }
        return rich;
    }


    //LeecCode link -> https://leetcode.com/problems/goal-parser-interpretation/description/
    //My LeetCode profile: https://leetcode.com/aydinibrahimov
    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}

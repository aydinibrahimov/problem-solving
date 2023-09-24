package com.aydinibrahimov.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSolutions {
    public static void main(String... args) {
        String f = "RLRRLLRLRL";

        System.out.println(balancedStringSplit(f));

    }


    public static int balancedStringSplit(String s) {
        int ans = 0, l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                ++l;
            } else {
                --l;
            }
            if (l == 0) {
                ++ans;
            }
        }
        return ans;
    }

    public static int getTotal(String... names) {
        return Arrays.stream(names)
                .parallel()
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }


    //LeecCode link -> https://leetcode.com/problems/goal-parser-interpretation/description/
    //My LeetCode profile: https://leetcode.com/aydinibrahimov
    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }


    public static int mostWordsFound(String[] sentences) {
        int longest = 0;
        for (String sentence : sentences) {
            int n = sentence.split(" ").length;
            longest = Math.max(longest, n);
        }
        return longest;
    }


}

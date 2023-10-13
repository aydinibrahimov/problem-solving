package com.aydinibrahimov.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSolutions {
    public static void main(String[] args) {
        List<List<String>> list = List.of(List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));
    }

    public String truncateSentence(String s, int k) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String, Integer> map = Map.of("type", 0, "color", 1, "name", 2);
        int index = map.get(ruleKey);
        int count = 0;

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) count++;
        }

        return count;
    }


    public static String restoreString(String s, int[] indices) {
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[indices[i]] = s.charAt(i);
        }
        return String.valueOf(charArray);
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

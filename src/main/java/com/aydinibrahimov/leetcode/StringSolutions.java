package com.aydinibrahimov.leetcode;


import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.*;

public class StringSolutions {
    public static void main(String[] args) {

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s = new StringBuilder();
        String x = null, y = "";
        for (x:
             word1) {
            s.append(x);
        }

        StringBuilder t = new StringBuilder();
        for (y:
             word2) {
            s.append(y);
        }
        return x.equals(y);

    }

    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(4); j++) {
                ans.add(i + "" + j);
            }
        }
        return ans;
    }

    public static String truncateSentence(String s, int k) {
        int i = 0, n = 0;
        for (char p : s.toCharArray()) {
            if (p == ' ') n++;
            if (n == k) break;
            i++;
        }
        return s.subSequence(0, i).toString();
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

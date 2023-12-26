package com.aydinibrahimov.leetcode;


import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import javax.swing.tree.TreeNode;
import java.util.*;

public class StringSolutions {

    public static void main(String[] args) {


    }



    public static int minOperations(String s) {
        int count=0;
            for(int i=0;i<=s.length()-2;i+=2){
               if( s.charAt(i)=='0' && s.charAt(++i)=='1'){
                   continue;
                   return count;
               }else{

               }
            }
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {

        int i=0;
        List<Integer> list=new ArrayList<>();
        for(String s: words){
            s.
            if(s.contains(String.valueOf(x))) {
                list.add(i);
            }
            i++;
        }
        return list;

    }



    public static int lengthOfLastWord(String s) {
        int lastIndex = s.length() - 1;
        int count = 0;
        for (int i = lastIndex; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            } else if (s.charAt(i) == ' ' && count != 0) {
                break;
            }
            count++;
        }
        return count;
    }

    public String largestOddNumber(String num) {
        int c = 0;
        for (char s : num.toCharArray()) {
            int a = Integer.valueOf(s);
            if (c < a) c = a;
        }
        return String.valueOf(c);
    }

    public static void foo(int a) {
        if (a == 0) return;
        foo(a - 1);
        System.out.println(a);
    }


    public String decodeMessage(String key, String message) {


        return "";
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = String.join("", word1);
        String b = String.join("", word2);
        return a.equals(b);
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

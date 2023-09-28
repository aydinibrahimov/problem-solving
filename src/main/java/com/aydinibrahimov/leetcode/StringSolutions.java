package com.aydinibrahimov.leetcode;


public class StringSolutions {
    public static void main(String[] args) {
    String s="codeleet";
    int[]i={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, i));

    }

    public static String restoreString(String s, int[] indices) {
        String[] ss=new String[s.length()];
       for(int i: indices){
           ss[i]=String.valueOf(s.charAt(i));
       }
       s="";
        for(String k:ss){
            s+=k;
        }

        return s;
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

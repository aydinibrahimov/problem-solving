package com.aydinibrahimov.leetcode;

public class GoalParser {
    public static void main(String[] args) {
        String s="G()()()()(al)";
        s =s.replace("()","o");

        s=s.replace("(al)","al");
        System.out.println(s);
        System.out.println(interpret("G()()()()(al)"));

        System.out.println("aabcaa".replace("aa","rrr"));


    }

    public static String interpret(String command) {
        String ans = "";

        int i = 0;
        char[] arr = command.toCharArray();
        for (char a : arr) {
            if (command.contains("()")) {
               ans= command.replace("()","o");

            }
            if (command.contains("(al)")) {
               ans= command.replace("(al)","al");
            }
        }

        return command;
    }
}

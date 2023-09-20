package com.aydinibrahimov.leetcode;

public class GoalParser {
    public static void main(String[] args) {

        String s = "G()()()()(al)";
        System.out.println(interpret(s));


    }

    //LeecCode link -> https://leetcode.com/problems/goal-parser-interpretation/description/
    //My LeetCode profile: https://leetcode.com/aydinibrahimov
    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}

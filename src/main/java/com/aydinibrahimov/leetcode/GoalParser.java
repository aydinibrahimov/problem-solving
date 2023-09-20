package com.aydinibrahimov.leetcode;

public class GoalParser {
    public static void main(String[] args) {
        String s = "G()()()()(al)";
        s = s.replace("()", "o");

        s = s.replace("(al)", "al");
        System.out.println(s);
        System.out.println(interpret("G()()()()(al)"));

        System.out.println("aabcaa".replace("aa", "rrr"));


    }

    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}

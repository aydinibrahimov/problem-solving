package com.aydinibrahimov.leetcode;

public class GoalParser {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4,}, {8, 5, 2, 4, 6}};
        System.out.println(maximumWealth(arr));

    }

    //LeecCode link -> https://leetcode.com/problems/richest-customer-wealth/
    //My LeetCode profile: https://leetcode.com/aydinibrahimov

    public static int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int rich=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum=sum+accounts[i][j];

            }
            if(rich<sum)rich=sum;
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

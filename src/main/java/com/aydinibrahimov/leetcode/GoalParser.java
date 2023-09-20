package com.aydinibrahimov.leetcode;

public class GoalParser {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));


    }

    public static String interpret(String command) {
        String ans = "";
        int i=0;
        char[] arr=command.toCharArray();
        for(char a : arr)
            if(a=='(' && arr[i+1]==')'){
                ans.concat("o");

            }else if(a=='(' && arr[i+1]=='a'&& arr[i+2]=='l'&&arr[i+3]==')'){
                ans.concat("al");
            }else {
                ans.concat("G");
            }

        return ans;
    }
}

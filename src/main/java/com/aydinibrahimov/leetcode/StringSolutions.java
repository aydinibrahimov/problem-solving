package com.aydinibrahimov.leetcode;


import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.util.*;

public class StringSolutions {
    public static void main(String[] args) {
       int s=300;
        System.out.println(Integer.toBinaryString(s));
        System.out.println(s);
        byte b= (byte) s;
        System.out.println(b);

       List<Integer> list=Arrays.asList(1,2,3);

        System.out.println(list.set(2,7));
        System.out.println(list);


    }

//    public static String longestCommonPrefix(String[] strs) {
//        int i=0;
//        int j=0;
//
//        if(strs.length==0){return "";}
//        for (String element : strs) {
//            if(element.equals("")){
//                return "";
//            }
//           boolean b= strs[i+1].startsWith(element.substring(0,element.length()-j));
//            i++;
//            if(b){continue;}
//            j++;
//
//        }
//
//        String s = strs[0];
//        String v="";
//       int i=0;
//             v = s.substring(0, s.length() - i);
//            for (String element : strs) {
//                boolean b = element.startsWith(v);
//                i++;
//                if(b){
//                    continue;
//                }else{
//                    break;
//                }
//
//            }
//
//
//        return v;
//
//    }

    public static String decodeMessage(String key, String message) {


        return "";
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
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

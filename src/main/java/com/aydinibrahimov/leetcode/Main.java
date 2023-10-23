package com.aydinibrahimov.leetcode;

import org.yaml.snakeyaml.nodes.CollectionNode;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


public class Main {

    public boolean isPowerOfFour(int n) {
        int power = 1;
        int base = 4;
        while (n >= base) {
            power *= base;
            if (n % 4 == 0) {
                n /= base;
            } else {
                return false;
            }
        }
        if (n == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        double result = Math.pow(4, 2);
        System.out.println(result);


    }

    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .count() < nums.length;
    }


    static String reverseString(String str) {
        int l = str.length();
        Stack<Character> items = new Stack<>();
        for (char c : str.toCharArray()) {
            items.push(c);
        }
        str = "";
        for (int i = 0; i < l; i++) {
            char c = items.pop();
            str += (String.valueOf(c));
        }
        return str;
    }


    public static boolean isBalanced(String expression) {
        HashMap<Character, Character> oC = new HashMap<>();
        oC.put('(', ')');
        oC.put('{', '}');
        oC.put('[', ']');

        int count = 0;
        for (int i = 0; i < expression.length(); i++) {
            char crrCh = expression.charAt(i);
            if (oC.containsKey(crrCh)) {
                count++;
                oC.put(crrCh, null);
            } else if (oC.containsValue(crrCh)) {
                Character mB = oC.remove(oC.get(crrCh));
                if (mB != crrCh) {
                    return false;
                }
                count--;
            }
        }

        return count == 0;
    }

}


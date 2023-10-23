package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main {

    public static void main(String[] args) {
        Iterable i=new ArrayList();
        Iterator it=new Vector<>();
        Collection c=new LinkedList();
        List a=new CopyOnWriteArrayList();
        Set<Integer> set=new HashSet<>();



        System.out.println(reverseString("Aydin"));
        Stack<String> items = new Stack<>();
        items.push("A");
        items.push("Y");
        items.push("D");
        items.push("I");
        items.push("N");


        System.out.println(items);
        System.out.println(items.pop());
        System.out.println(items);
        System.out.println(items.pop());
        System.out.println(items);
        System.out.println(items.pop());
        System.out.println(items);
        System.out.println(items.pop());
        System.out.println(items);


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


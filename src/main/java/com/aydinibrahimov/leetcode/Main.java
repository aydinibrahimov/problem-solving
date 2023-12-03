package com.aydinibrahimov.leetcode;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {



    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
               } catch (RuntimeException e) {
                  System.out.print("d");
                  throw new RuntimeException("2");
               } finally {
                  System.out.print("e");
                  throw new RuntimeException("3");
               }
    }

}






package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GoodPairs  {
    public static void main(String[] args) {
        String[] s={"alice and bob love leetcode","i think so too","this is great thanks very much"};
        for(String r:s){
            System.out.println(r.isBlank());
        }

    }
    public static int mostWordsFound(String[] sentences) {

        Arrays.stream(sentences).filter(clause->clause.contentEquals(" ")).count();
return 0;
    }


    public static int maximumWealth(int[][] accounts) {
        int l=accounts.length;
        int h=accounts[0].length;
        System.out.println(l+" "+h);
        int sum=0;
        int rich;
        for(int a=0;a<l;a++){
            rich= 0;
        for(int b=0;b<l;b++){
                rich=rich+accounts[a][b];
            }
            if(sum>rich)continue;
            sum=rich;
        }return sum;
    }
    public static int numIdenticalPairsA(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count += map.get(nums[i]);
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return count;
    }

    public static int numIdenticalPairsB(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }

    public static int numIdenticalPairsC(int[] nums) {
        int count = 0, i = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums) {

            if(map.containsKey(a)){
                count++;
            }else{
                map.put(a, i);
            }
            i++;
        }

        return count;
    }
}

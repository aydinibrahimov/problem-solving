package com.aydinibrahimov.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GoodPairs {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = {1, 2, 3, 1, 1, 3};
        int[][] d= {{1,2,3,4,5,6,7},{8,7,4,5,6,1,2},{0,9,8,2,5,4,7}};
        List<Integer> list=new ArrayList<>();
        list=Arrays.stream(d).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
        for(int a:list){
            sum+=a;
        }


    System.out.println(numIdenticalPairsA(arr));
        System.out.println(numIdenticalPairsC(arr));
        System.out.println(list);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 5);
        map.put(1, 5);
        System.out.println(map);


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

package com.aydinibrahimov.leetcode;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class ArraySolutions {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};

    }

    public static int removeDuplicates(int[] nums) {
        int n = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[n++] = nums[i + 1];
            }
        }
        return n;
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int i;
        for (i = 0; i < nums.size(); i++)

    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) count++;
            }
            arr[i] = count;
        }
        return nums;
    }

    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int min = 10;
        int max = 0;
        int profit = 0;
        for (int i : prices) {

        }
        return profit;
    }

    // [1,2,3,4]-->[1,3,6,10]
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums.get(i) + nums.get(j)) < target)
                    count++;
            }
        }
        return count;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int c : candies) {
            if (c > max) max = c;
        }
        for (int c : candies) {
            list.add((c + extraCandies) >= max);
        }
        return list;
    }


    public static long numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return Arrays.stream(hours)
                .filter(h -> h >= target)
                .count();
    }


    //LeecCode link -> https://leetcode.com/problems/richest-customer-wealth/
    //My LeetCode profile: https://leetcode.com/aydinibrahimov
    public static int maximumWealth1(int[][] accounts) {
        int n = accounts.length;
        int rich = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (rich < sum) rich = sum;
        }
        return rich;
    }


    public static int maximumWealth(int[][] accounts) {
        int l = accounts.length;
        int h = accounts[0].length;
        System.out.println(l + " " + h);
        int sum = 0;
        int rich;
        for (int a = 0; a < l; a++) {
            rich = 0;
            for (int b = 0; b < l; b++) {
                rich = rich + accounts[a][b];
            }
            if (sum > rich) continue;
            sum = rich;
        }
        return sum;
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

            if (map.containsKey(a)) {
                count++;
            } else {
                map.put(a, i);
            }
            i++;
        }

        return count;
    }

}

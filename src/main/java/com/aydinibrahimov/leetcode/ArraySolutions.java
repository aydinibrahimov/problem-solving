package com.aydinibrahimov.leetcode;

import java.util.*;


public class ArraySolutions {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 6};
        int target = 2;

        System.out.println(searchInsert(array, target));

    }


    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static int findNonMinOrMax(int[] nums) {
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 1; i < nums.length; i++) {

            int min = nums[0];
            int max = min;

            if (min > nums[i]) {
                minIndex = i;
            } else if (max < nums[i]) {
                maxIndex = i;
            }

        }
        if (minIndex == -1 && maxIndex == -1) {
            return -1;
        }
        return 0;
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 1; i < s.length(); i++) {

            int val = map.get(s.charAt(i - 1));
            if (map.get(s.charAt(i)) > val) {
                val = -1 * val;
            }
            result = result + val;
        }
        return result + map.get(s.charAt(s.length() - 1));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            temp = temp + nums[i - 1];
            leftSum[i] = temp;
        }

        temp = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            temp = temp + nums[i + 1];
            rightSum[i] = temp;
        }
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            result[i] = Math.abs(leftSum[i] - rightSum[i]);

        }
        return result;
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int a : nums) {
            if (a != val) {
                nums[i] = a;
                i++;
            }
        }
        return i;
    }

//    public int[] leftRightDifference(int[] arr) {
//        int n = arr.length - 1;
//        List<Integer> list
//                = Arrays.stream(arr).boxed().collect(
//                Collectors.toList());
//        for (
//                int i = 1;
//                i <= n; i++) {
//            int leftSum = list.subList(0, i)
//                    .stream()
//                    .mapToInt(x -> x)
//                    .sum();
//            int rightSum = list.subList(i + 1, n)
//                    .stream()
//                    .mapToInt(x -> x)
//                    .sum();
//
//
//        }
//        return null;
//    }


    public static int removeDuplicates(int[] nums) {
        int n = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[n++] = nums[i + 1];
            }
        }
        return n;
    }

    public static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        return arr;

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

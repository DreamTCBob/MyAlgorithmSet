package com;

import java.util.Arrays;

public class threeSumClose {
    private int sum(int[] nums, int target){
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {//当前和大于还是小于目标数字，如果大于则放小，否则放大
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        threeSumClose threeSum = new threeSumClose();
        int[] ints = new int[4];
        ints[0] = -1;
        ints[1] = 2;
        ints[2] = 1;
        ints[3] = -4;
        System.out.println(threeSum.sum(ints,1));
    }
}

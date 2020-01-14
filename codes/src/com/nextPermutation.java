package com;

import java.util.Arrays;

public class nextPermutation {
    private static void next(int[] nums){
        if(nums.length <= 1) return;
        if(nums.length == 2){
            int k = nums[0];
            nums[0] = nums[1];
            nums[1] = k;
            return;
        }
        int i = nums.length - 1;
        int j = nums.length - 2;
        int cmp = 1;
        while (cmp >= 0 && j >= 0){
            cmp = nums[j] - nums[i];
            if(cmp >= 0) {
                i -= 1;
                j -= 1;
                if(j == 0) break;
            }else break;
        }
        if(j == 0){
            if(nums[j] >= nums[i]){
                Arrays.sort(nums);
                return;
            }
        }
        while(nums[j] < nums[i]) {
            i++;
            if(i == nums.length) break;
        }
        i -= 1;
        int flag = nums[j];
        nums[j] = nums[i];
        nums[i] = flag;
        int[] copy = new int[nums.length - j - 1];
        System.arraycopy(nums, j+1 , copy , 0 , nums.length - j - 1);
        Arrays.sort(copy);
        System.arraycopy(copy, 0 , nums, j+1 , nums.length - j - 1);
        System.out.println(nums);
    }
    public static void main(String[] args){
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        next(nums);
    }
}

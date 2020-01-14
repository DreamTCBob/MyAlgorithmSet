package com;

import java.util.Arrays;
import java.util.Stack;

public class removeDuplicates {
    private static int remove(int[] nums){
        if(nums.length == 0) return 0;
        int flag = 1;
        int len = 1;
        int i = 0 , j = 0;
        while (j < nums.length){
            if(nums[i] == nums[j]) j++;
            else{
                len += 1;
                if((j - i) > 0 && nums[flag] < nums[j]) {
                    nums[flag] = nums[j];
                    flag += 1;
                    i = j;
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] nums = new int[10];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 2;
        nums[6] = 2;
        nums[7] = 3;
        nums[8] = 3;
        nums[9] = 4;
        System.out.println(remove(nums));
    }
}

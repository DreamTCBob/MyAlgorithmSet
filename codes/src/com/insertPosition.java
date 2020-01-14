package com;

public class insertPosition {
    private static int searchInsert(int[] nums, int target){
        if(nums.length == 0) return 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= target) return i;
        }
        return nums.length;
    }
    public static void main(String[] args){
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        System.out.println(searchInsert(nums, 5));
    }
}

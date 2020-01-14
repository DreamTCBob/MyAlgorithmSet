package com.sort;

public class SortColors {
    private static void sortColors(int[] nums){
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0) {
                exch(nums, ++zero, one++);
            } else if (nums[one] == 2) {
                exch(nums, --two, one);
            } else {
                ++one;
            }
        }
    }
    private static void exch(int[] nums, int lo, int hi){
        int k = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = k;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}

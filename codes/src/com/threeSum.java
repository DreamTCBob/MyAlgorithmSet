package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    private List<List<Integer>> sum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        threeSum threeSum = new threeSum();
        int[] ints = new int[6];
        ints[0] = -1;
        ints[1] = 0;
        ints[2] = 1;
        ints[3] = 2;
        ints[4] = -1;
        ints[5] = -4;
        System.out.println(threeSum.sum(ints));
    }
}

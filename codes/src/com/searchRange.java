package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class searchRange {
    private static int[] search(int[] nums, int target){
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = nums.length - 1;
        int[] re = {-1,-1};
        while(start <= end){
            int mid = (end + start) / 2;
            if(nums[mid] == target){
                int left = mid;
                while (nums[mid] == target) {
                    mid++;
                    if (mid == nums.length) break;
                }
                re[1] = mid - 1;
                while(nums[left] == target){
                    left --;
                    if(left == -1) break;
                }
                re[0] = left + 1;
                return re;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else end = mid -1;
        }
        return re;
    }
    public static void main(String[] args){
        int[] nums = {5,7,8,8,8,8,10};
        int target = 8;
        System.out.println(search(nums,target)[0]);
        System.out.println(search(nums,target)[1]);
    }
}

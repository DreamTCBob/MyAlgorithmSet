package com.doublePointer;

public class MergeTwoArray {
    private static void merge(int[] nums1, int m, int[] nums2, int n){
        int index = m + n - 1;
        int first = m - 1;
        int second = n - 1;
        while(first >= 0 || second >= 0){
            if(first < 0) nums1[index--] = nums2[second--];
            else if(second < 0) nums1[index--] = nums1[first--];
            else if(nums1[first] >= nums2[second]) nums1[index--] = nums1[first--];
            else nums1[index--] = nums2[second--];
        }
        System.out.println(1);
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }
}

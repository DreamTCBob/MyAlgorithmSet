package com.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest {
    private static int find(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    private static int findByHeap(int[] nums, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : nums){
            priorityQueue.add(i);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }

    /**
     * 借用快速排序的思想，但是只排能寻找到k的部分
     * @param nums
     * @param k
     * @return
     */
    private static int findByQuick(int[] nums, int k){
        k = nums.length - k;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k) {
                break;
            } else if (j < k) {
                l = j + 1;
            } else {
                h = j - 1;
            }
        }
        return nums[k];
    }
    private static int partition(int[] a, int l, int h){
        int i = l, j = h + 1;
        while (true) {
            while (a[++i] < a[l] && i < h) ;
            while (a[--j] > a[l] && j > l) ;
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }
    private static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findByQuick(nums,k));
    }
}

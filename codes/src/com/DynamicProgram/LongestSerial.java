package com.DynamicProgram;

public class LongestSerial {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        /**
         * 定义一个 tails 数组，其中 tails[i] 存储长度为 i + 1 的最长递增子序列的最后一个元素。对于一个元素 x，
         * 如果它大于 tails 数组所有的值，那么把它添加到 tails 后面，表示最长递增子序列长度加 1；
         * 如果 tails[i-1] < x <= tails[i]，那么更新 tails[i] = x。
         */
        int[] tails = new int[n];
        int len = 0;
        for (int num : nums) {
            int index = binarySearch(tails, len, num);
            /**
             * 选择所有当前已经遍历过元素的最合适的元素
             */
            tails[index] = num;
            /**
             * 如果它大于 tails 数组所有的值，那么把它添加到 tails 后面，表示最长递增子序列长度加 1
             */
            if (index == len) {
                len++;
            }
        }
        return len;
    }

    private int binarySearch(int[] tails, int len, int key) {
        int l = 0, h = len;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (tails[mid] == key) {
                return mid;
            } else if (tails[mid] > key) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        LongestSerial longestSerial = new LongestSerial();
        int[] nums = {6,3,5,7,1,2,8};
        System.out.println(longestSerial.lengthOfLIS(nums));
    }
}

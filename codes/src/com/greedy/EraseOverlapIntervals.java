package com.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {
    private static int eraseOverlapIntervals(int[][] intervals){
        //贪心的规则是：
        //在每次选择中，区间的结尾最为重要，选择的区间结尾越小，留给后面的区间的空间越大，那么后面能够选择的区间个数也就越大
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        /**
         * 重写Comparator方法制定排序规则
         */
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
        int cnt = 1;
        int end = intervals[0][1];
        for (int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] < end) continue;
            end = intervals[i][1];
            cnt ++;
        }
        return intervals.length - cnt;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}

package com.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {
    private static int findMinArrowShots(int[][] points){//points数组是直径
        //贪心的规则是：
        //在每次选择中，区间的结尾最为重要，选择的区间结尾越小，留给后面的区间的空间越大，那么后面能够选择的区间个数也就越大
        if(points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        /**
         * 重写Comparator方法制定排序规则
         */
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1] - o2[1];
//            }
//        });
        int cnt = 1;
        int end = points[0][1];
        for (int i = 1 ; i < points.length ; i++){
            if(points[i][0] <= end) continue;
            end = points[i][1];
            cnt ++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}

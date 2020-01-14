package com.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReconstructQueue {
    private static int[][] reconstructQueue(int[][] people){
        if(people == null || people.length == 0 || people[0].length == 0) return new int[0][0];
//        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        /**
         * 重排序，0位置降序，1位置升序
         */
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o2[0] - o1[0];
            }
        });
        List<int[]> queue = new ArrayList<>();
        /**
         * 按照1位置的前方人数排序，0位置元素自动升序排列（ArraysList的特性）
         * 贪心规则：局部最优解到全局最优解
         */
        for (int[] q : people){
            queue.add(q[1], q);
        }
        return queue.toArray(new int[queue.size()][]);
    }

    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(reconstructQueue(people));
    }
}

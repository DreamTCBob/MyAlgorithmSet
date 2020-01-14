package com;

public class Sqrt {
    private static int sqrt(int x){
        if (x <= 1) {
            return x;
        }
        int l = 1, h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return h;//最终h<l  要返回小的
    }
    public static void main(String[] args){
        System.out.println(sqrt(6));
    }
}

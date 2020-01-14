package com.greedy;

import java.util.concurrent.ConcurrentNavigableMap;

public class CanPlaceFlowerbed {
    private static boolean canPlaceFlowerbed(int[] flowerbed, int n){
        if(flowerbed.length == 1) return flowerbed[0] == 0 || n == 0;
        for (int i = 0 ; i < flowerbed.length ; i++){
            if(flowerbed[i] == 1) continue;
            if(flowerbed[i] == 0){
                if(i == 0) {
                    if(flowerbed[i+1] == 1)
                        continue;
                    else {
                        flowerbed[i] = 1;
                        n = n - 1;
                        continue;
                    }
                }
                if(i == flowerbed.length - 1) {
                    if(flowerbed[i - 1] == 0) {
                        n = n - 1;
                        continue;
                    }
                }
                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0};
        int n = 1;
        System.out.println(canPlaceFlowerbed(flowerbed, n));
    }
}

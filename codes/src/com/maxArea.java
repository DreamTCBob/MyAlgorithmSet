package com;

public class maxArea {
    private int max(int[] height){
        if(height.length == 0 || height.length == 1)
            return 0;
        int max = 0;
        for(int i = 0 ; i < height.length-1 ; i++){
            for(int j = i+1 ; j <height.length ; j++){
                max = Math.min(height[i],height[j]) * (j-i) > max ? Math.min(height[i],height[j]) * (j-i) : max;
            }
        }
        return max;
    }
    public static void main(String[] args){
        maxArea maxArea = new maxArea();
        int[] height = new int[9];
        height[0] = 1;
        height[1] = 8;
        height[2] = 6;
        height[3] = 2;
        height[4] = 5;
        height[5] = 4;
        height[6] = 8;
        height[7] = 3;
        height[8] = 7;
        System.out.println(maxArea.max(height));
    }
}

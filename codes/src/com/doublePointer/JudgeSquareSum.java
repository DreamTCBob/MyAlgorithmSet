package com.doublePointer;

public class JudgeSquareSum {
    private static boolean judge(int c){
        if(c < 0) return false;
        int l = 0, h = (int)Math.sqrt(c);
        while(l <= h){
            if((l*l + h*h) == c){return true;}
            else if((l*l + h*h) > c){
                h -= 1;
            }else l += 1;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(judge(2));
    }
}

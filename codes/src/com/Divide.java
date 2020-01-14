package com;

public class Divide {
    private static int divide(int dividend, int divisor){
        if (dividend == 1 << 31 && divisor == -1) return (1 << 31) - 1;//左移*2 右移/2
        int a = Math.abs(dividend), b = Math.abs(divisor), res = 0, x = 0;
        int m = 0;
        int n = 0;
        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++) {
                n = b << x << 1;
                m = a - (b << x << 1);
            }
            res += 1 << x;
            a -= b << x;
        }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
    public static void main(String[] args){
        System.out.println(divide(-12, 3));
    }
}

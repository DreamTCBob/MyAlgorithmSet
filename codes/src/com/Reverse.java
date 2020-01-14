package com;

public class Reverse {
    private int reverse_1(int x){
        Integer x1 = x;
        String s = x1.toString();
        if(s.charAt(0) == 45){
            s = s.substring(1);
            String r = new StringBuffer(s).reverse().toString();
            long f = Long.parseLong(r);
            f = -f;
            if (f < Integer.MIN_VALUE)
                return 0;
            return -Integer.parseInt(r);
        }else {
            String r = new StringBuffer(s).reverse().toString();
            long f = Long.parseLong(r);
            if (f > Integer.MAX_VALUE)
                return 0;
            return Integer.parseInt(r);
        }
    }
    public static void main(String[] args){
        int x = -1534236459;
        Reverse reverse = new Reverse();
        int i = reverse.reverse_1(x);
        System.out.println(i);
    }
}

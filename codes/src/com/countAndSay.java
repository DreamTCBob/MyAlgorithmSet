package com;

/*
用递归来实现
 */
public class countAndSay {
    private static String count(int n){
        if(n == 1) return "1";
        String prev = count(n - 1);
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < prev.length()) {
            char curr = prev.charAt(i);
            int j = 0;
            while(i+j < prev.length() && prev.charAt(i+j) == curr) j++;//数出来相同数字的个数
            str.append(j);
            str.append(curr);
            i += j;
        }
        return str.toString();
    }
    public static void main(String[] args){
        int n = 9;
        System.out.println(count(n));
    }
}

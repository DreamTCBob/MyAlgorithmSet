package com.doublePointer;

public class ValidPalindrome {
    private static boolean valid(String s){
        int l = 0, h = s.length() - 1;
        int flag = 1;
        while(l <= h){
            if(s.charAt(l) == s.charAt(h)){
                l++;
                h--;
            }
            else{
                return(judge(s.substring(l,h)) || judge(s.substring(l+1, h+1)));
            }
        }
        return true;
    }
    private static boolean judge(String s){
        int l = 0, h = s.length() - 1;
        int flag = 1;
        while(l <= h) {
            if (s.charAt(l) == s.charAt(h)) {
                l++;
                h--;
            }else return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(valid("abca"));
    }
}

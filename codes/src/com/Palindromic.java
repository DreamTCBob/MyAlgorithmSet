package com;


public class Palindromic {
    private String longestPalindrome(String s){
        String result=null;
        int max=0;
        for(int i=0;i<s.length();i++){
            int pStart=i;
            int pEnd=i+1;
            while(pStart>=0&&pEnd<=(s.length()-1)&&s.charAt(pStart)==s.charAt(pEnd)){
                pStart--;
                pEnd++;
            }
            if(pEnd-pStart-1>max){
                max=pEnd-pStart-1;
                result=s.substring(pStart+1, pEnd-1+1);
            }
            pStart=i-1;
            pEnd=i+1;
            while(pStart>=0&&pEnd<=(s.length()-1)&&s.charAt(pStart)==s.charAt(pEnd)){
                pStart--;
                pEnd++;
            }
            if (pEnd-pStart-1>max) {
                max=pEnd-pStart-1;
                result=s.substring(pStart+1, pEnd-1+1);
            }
        }
        result = result == null ? "" : result;
        return result;
    }
    public static void main(String[] args){
        String s = "aaaaa";
        Palindromic palindromic = new Palindromic();
        System.out.println(palindromic.longestPalindrome(s));
    }
}

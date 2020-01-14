package com;

import java.util.ArrayList;

public class SubString {
    public static int lengthOfLongestSubstring(String s){
        if(s.length() > 1) {
            ArrayList<Integer> integers = new ArrayList<Integer>();
            String s2 = "";
            int r = 0;
            int j = 0;
            int l = 1;
            int flag;
            for (int i = 0; i < s.length(); i += 0) {
                char s1 = s.charAt(j);
                s2 += s1;
                j += 1;
                l = 1;
                if( j >= s.length()) break;
                while ((!s2.contains(String.valueOf(s.charAt(j))) || l == 1)) {
                    if(s.charAt(j) == s1) break;
                    s1 = s.charAt(j);
                    j += 1;
                    l += 1;
                    s2 += s1;
                    if( j >= s.length()) break;
                }
                s2 = "";
                integers.add(l);
                i += 1;
                if (j == s.length() - 1) break;
                j = i;
            }
            for (int i = 0; i < integers.size(); i++) {
                flag = r;
                r = integers.get(i);
                r = r >= flag ? r : flag;
            }
            return r;
        }
        else if(s.equals("")) return 0;
        else return 1;
    }
    public static void main(String[] args){
        String s = "dstga";
        int out = lengthOfLongestSubstring(s);
        System.out.println(out);
    }
}

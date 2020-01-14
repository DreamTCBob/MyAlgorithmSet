package com.doublePointer;

import java.util.*;

public class FindLongestWord {
    private static String find(String s, List<String> d){
        List<String> list = new ArrayList<>();
        for(String s1 : d){
            if(judge(s,s1)) list.add(s1);
        }
        if(list.size() == 0) return "";
        else {
            Collections.sort(list);
            String max = list.get(0);
            for(String s1 : list){
                if(s1.length() > max.length()) max = s1;
            }
            return max;
        }
    }
    private static boolean judge(String s, String s1){
        int i = 0, j = 0;
        while(i < s.length() && j < s1.length()){
            if(s.charAt(i) == s1.charAt(j)){
                i++;
                j++;
            }else i++;
        }
        return j == s1.length();
    }
    public static void main(String[] args){
        String s = "abpllec";
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(find(s,list));
    }
}

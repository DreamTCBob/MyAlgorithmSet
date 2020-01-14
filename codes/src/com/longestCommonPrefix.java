package com;

public class longestCommonPrefix {
    private String longest(String[] strs){
        String string = "";
        if(strs.length == 0) return "";
        int len = strs[0].length();
        for(int i = 0 ; i < len ; i++){
            for(int j = 1 ; j < strs.length ; j++){
                if(strs[j].equals("")) return "";
                if(strs[j].length() == i) return string;
                if(strs[j].charAt(i) != strs[0].charAt(i)) return string;
            }
            string = strs[0].substring(0, i+1);
        }
        return string;
    }
    public static void main(String[] args){
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
        String[] strings = new String[3];
        strings[0] = "aa";
        strings[1] = "a";
        strings[2] = "aaa";
        System.out.println(longestCommonPrefix.longest(strings));
    }
}

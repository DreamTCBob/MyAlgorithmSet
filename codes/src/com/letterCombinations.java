package com;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
    private List<String> com(String digits){
        List<String> list = new ArrayList<>();
        if(digits.equals("")) return list;
        for(char c : digits.toCharArray()){
            list = into(list, c);
        }
        return list;
    }
    private List<String> into(List<String> list, char c){
        List<String> stringList = new ArrayList<>();
        String[] digs = new String[10];
        digs[0] = digs[1] = "";
        digs[2] = "abc";
        digs[3] = "def";
        digs[4] = "ghi";
        digs[5] = "jkl";
        digs[6] = "mno";
        digs[7] = "pqrs";
        digs[8] = "tuv";
        digs[9] = "wxyz";
        for(int i = 0 ; i < digs[c-'0'].length() ; i++){
            if(list.size() == 0){
                stringList.add(String.valueOf(digs[c-'0'].charAt(i)));
            }
            else {
                for (int j = 0; j < list.size(); j++) {
                    stringList.add(list.get(j) + digs[c-'0'].charAt(i));
                }
            }
        }
        return stringList;
    }
    public static void main(String[] args){
        letterCombinations letterCombinations = new letterCombinations();
        System.out.print(letterCombinations.com(""));
    }
}

package com;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    private static List<String> solution(int n){
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }
    private static void backtrack(List<String> list, String str, int open, int close, int max){//递归去加括号，双计数法

        if(str.length() == max*2){
            list.add(str);
            return;
        }
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }
    public static void main(String[] args){
        System.out.println(solution(3));
    }
}

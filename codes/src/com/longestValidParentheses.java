package com;

import java.util.Stack;

public class longestValidParentheses {
    private static int parentheses(String s){//用栈来标记序号，只要栈内存在元素就一定是连续的
        Stack<Integer> stack = new Stack<Integer>();
        int max=0;
        int left = -1;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='(') stack.push(j);
            else {
                if (stack.isEmpty()) left=j;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max=Math.max(max,j-left);
                    else max=Math.max(max,j-stack.peek());
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        String s = "()(()";
        System.out.println(parentheses(s));
    }
}

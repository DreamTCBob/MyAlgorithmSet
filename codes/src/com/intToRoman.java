package com;

public class intToRoman {
    private String to(int num){

        return "";
    }
    private int reTo(String s){
        int result = 0;
        char[] chars = s.toCharArray();
        int n = chars.length;
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++){
            switch(chars[i])
            {
                case 'M':
                    num[i] = 1000;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'L':
                    num[i] = 50;
                    break;
                case 'X':
                    num[i] = 10;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'I':
                    num[i] = 1;
                    break;
                default:
                    break;
            }
        }
        for(int i=0; i<n-1; i++)
        {
            if(num[i] < num[i+1])
                result -= num[i];
            else
                result += num[i];
        }
        result += num[n-1];
        return result;
    }
    public static void main(String[] args){
        intToRoman intToRoman = new intToRoman();
        int i = 1569;
        System.out.println(intToRoman.to(i));
        String string = "MCMXCIV";
        System.out.println(intToRoman.reTo(string));
    }
}

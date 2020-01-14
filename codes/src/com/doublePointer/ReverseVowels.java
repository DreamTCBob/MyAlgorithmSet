package com.doublePointer;

import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    private static String reverse(String s){
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        Character[] characters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> list = Arrays.asList(characters);
        while(i < j){
            if(list.contains(chars[i]) && list.contains(chars[j])){
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
                i++;
                j--;
                continue;
            }
            if(!list.contains(chars[i])) i++;
            if(!list.contains(chars[j])) j--;
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args){
        System.out.println(reverse("aA"));
    }
}

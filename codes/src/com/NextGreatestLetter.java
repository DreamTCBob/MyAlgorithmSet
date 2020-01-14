package com;

public class NextGreatestLetter {
    private static char next(char[] letters, char target){
        int n = letters.length;
        int l = 0, h = n - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (letters[m] <= target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l < n ? letters[l] : letters[0];
    }
    public static void main(String[] args){
        char[] chars = {'c','f','j'};
        System.out.println(next(chars,'g'));
    }
}

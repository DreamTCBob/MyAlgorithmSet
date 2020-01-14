package com.doublePointer;

public class twoSum {
    private static int[] sum(int[] numbers, int target){
        int[] ints = new int[2];
        int i = 0, j = numbers.length - 1;
        while (i <= j)
        {
            if((numbers[i] + numbers[j]) == target){
                ints[0] = numbers[i];
                ints[1] = numbers[j];
                return ints;
            }else if((numbers[i] + numbers[j]) > target)
                j--;
            else i++;
        }
        return null;
    }
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(sum(numbers, target));
    }
}

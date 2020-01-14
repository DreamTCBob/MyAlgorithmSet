package com;
import java.util.*;

public class coin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        while (in.hasNext()) {
            String s=in.nextLine();

            String[] str=s.split(" ");
            int[] a=new int[str.length];
            for(int i=0;i<str.length;i++){
                a[i]=Integer.parseInt(str[i]);
                list.add(a[i]);
            }
        }

    }
}

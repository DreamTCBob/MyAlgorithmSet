package com;
import java.util.HashMap;

public class SubStringByMap {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);//////j定位到新的起点，定位到被发现重复元素的下一个元素
            }
            map.put(s.charAt(i),i);//////HashMap不允许有重复值存在，插入重复值返回新的value
            max = Math.max(max,i-j+1);//////max为当前的最大值
        }
        return max;
    }
    public static void main(String[] args){
        String s = "pwwkew";
        SubStringByMap subStringByMap = new SubStringByMap();
        int out = subStringByMap.lengthOfLongestSubstring(s);
        System.out.println(out);
    }
}

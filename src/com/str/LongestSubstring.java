package com.str;
import java.util.*;
//无重复字符的最长子串
public class LongestSubstring {
    public int longestSubstring(String s){
        if(s.length()==0)
            return 0;
        Map<Character,Integer> dic=new HashMap<Character,Integer>();
        int left=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(dic.containsKey(s.charAt(i))){
                left=Math.max(left,dic.get(s.charAt(i))+1);
            }
            dic.put(s.charAt(i),i);
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}

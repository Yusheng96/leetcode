package com.base;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StrDemo {
    public static void main(String[] args) {
        String s=new String("20101001");
        try {

            int res= Integer.parseInt(s);
            System.out.println(res);
        } catch (NumberFormatException e) {
            System.out.println(s+"无法转化成数字");
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    public int specialStr (String inputStr, char[] cList) {
        // write code here
        String ans="";
        for(int i=0;i<inputStr.length();i++){
            int L=i-1,R=i+1;
            String sub=getString(inputStr,L,R);
            if(sub.length()>ans.length())
                ans=sub;
            L=i-1;
            R=i+1-1;
            sub=getString(inputStr,L,R);
            if(sub.length()>ans.length())
                ans=sub;
        }
        return ans.length();
    }

    public  String getString(String S,int L,int R){
        while(L>=0&&R<S.length()&&S.charAt(L)==S.charAt(R)){
            L--;
            R++;

        }
        return S.substring(L+1,R);
    }
    public int MoreThanHalfNums_Solution(int [] array) {
        Arrays.sort(array);
        int n=array.length/2;
        int num=array[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(array[i]==num)
            {
                c++;
            }
        }
        if(c>n)
            return num;
        else
            return 0;
    }
}

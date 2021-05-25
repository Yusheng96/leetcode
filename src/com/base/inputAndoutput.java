package com.base;

import java.util.*;
//输入不定长数组
public class inputAndoutput {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //1.新建输入对象
        ArrayList <Integer> list=new ArrayList<Integer>();
       // String str=new String();
         String str=input.nextLine();//2

        Scanner in=new Scanner(str);//3
        while(in.hasNext()){//4 hasNext()方法会判断接下来是否有非空字符.如果有,则返回true,否则返回false
            int tem=in.nextInt();
            list.add(tem);
        }
        Collections.sort(list);
        for(int x:list){
            System.out.print(x+" ");
        }
    }
}

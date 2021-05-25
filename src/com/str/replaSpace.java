package com.str;

public class replaSpace {
    public String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                sb.append("i love you");
            }
            else {
                sb.append(ch);
            }
        }


        return sb.toString();
    }

    public void main(String[] args) {
        String s="12  12   1212  12";
        System.out.print(replaceSpace(s));
    }
}

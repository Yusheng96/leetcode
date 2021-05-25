package com.str;
//JZ.58 翻转单词
/*输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
例如输入字符串"I am a student. "，则输出"student. a am I"。*/

public class reverseWords {
    public static String reverseWords(String s) {
        String[] str = s.trim().split(" |,");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].equals(""))
                continue;
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s="For support,use the  IT icon.";
        System.out.print(reverseWords(s));
    }
}
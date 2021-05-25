package com.base;

public class BignumAdd
{
    public static String bigNumberAdd(String s1, String s2) {

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        int len1 = a1.length;
        int len2 = a2.length;
        int i = len1 - 1, j = len2 - 1;
        int m = 0; //当前位上要相加的数
        int n = 0; //余数
        int num1 = 0, num2 = 0;
        StringBuffer s = new StringBuffer();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                num1 = a1[i] - '0';
            } else {
                num1 = 0;
            }
            if (j >= 0) {
                num2 = a2[j] - '0';
            } else {
                num2 = 0;
            }

            int sum = num1 + num2 + n;
            m = sum % 10;
            n = sum / 10;
            char c = (char)(m + '0');
            s.append(c);
            i--;
            j--;
        }
        if (n != 0) {
            s.append('1');
        }

        s.reverse();
        return s.toString();
    }
}

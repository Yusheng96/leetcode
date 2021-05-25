package com.base;

public class isIPaddress {
        //判断字符是否是IP
        public static boolean isCorrectIp(String ipString) {
            //1、判断是否是7-15位之间（0.0.0.0-255.255.255.255.255）
            if (ipString.length()<7||ipString.length()>15) {
                return false;
            }
            //2、判断是否能以小数点分成四段
            String[] ipArray = ipString.split("\\.");
            if (ipArray.length != 4) {
                return false;
            }
            for (int i = 0; i < ipArray.length; i++) {
                //3、判断每段是否都是数字
                try {
                    int number = Integer.parseInt(ipArray[i]);
                    //4.判断每段数字是否都在0-255之间
                    if (number <0||number>255) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        String ip="192.001.1.1";
        System.out.print(isCorrectIp(ip));
    }
}

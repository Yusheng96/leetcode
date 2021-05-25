package com.base;
import java.util.Scanner;
//切蛋糕
    public class MTtest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 2) {
            System.out.println("4");
        } else {
            System.out.println("2");
        }
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int sum=0, leap=0, valid=1;
//        int year=0;
//        int month=0;
//        int day=0;
//        try
//        {
//            year=scan.nextInt();
//            month=scan.nextInt();
//            day=scan.nextInt();
//        }
//        catch (Exception ex)
//        {
//            System.out.println("wrong");
//        }
//
//        if(year%400==0||(year%4==0&&year%100!=0)) {
//            leap=1;
//        }
//        else {
//            leap=0;
//        }
//
//        if((leap==0&&month==2&&day>28)||leap==1&&month==2&&day>29) {
//            valid=0;
//        }
//
//        if(((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day>31)) {
//            valid=0;
//        }
//
//        if(((month==4||month==6||month==9||month==11)&&day>30)) {
//            valid=0;
//        }
//
//        switch(month) {
//            case 1:sum=0;break;
//            case 2:sum=31;break;
//            case 3:sum=59;break;
//            case 4:sum=90;break;
//            case 5:sum=120;break;
//            case 6:sum=151;break;
//            case 7:sum=181;break;
//            case 8:sum=212;break;
//            case 9:sum=243;break;
//            case 10:sum=273;break;
//            case 11:sum=304;break;
//            case 12:sum=334;break;
//            default:valid=0;break;
//        }
//
//        sum=sum+day;
//
//        if(leap==1&&month>2){
//            sum++;
//        }
//
//        if(valid==1) {
//            if(sum%9==0)
//            {
//                System.out.println("Congratulations on the 999 gift package");
//            }
//            else
//            {
//                System.out.println("Thank you for your participation");
//            }
//        }
//        else {
//            System.out.println("wrong");
//        }
//    }
//}
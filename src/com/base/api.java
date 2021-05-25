package com.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class api {
	public static void main(String[] args) throws ParseException {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int a = 0;
//            int[] arr=new int[n];
//            for(int i = 0; i < n; i++){
//                a = sc.nextInt();
//                arr[i]=a;
//            }
		//System.out.println(ans);
		//  String test=new String("dada");
		Scanner sc = new Scanner(System.in);
		String s1 = "2020-01-02";
		String s2 = sc.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		Date d1 = df.parse(s1);
		Date d2 = df.parse(s2);
		long days = (d2.getTime() - d1.getTime() + 1000000) / (60 * 60 * 24 * 1000);
		long d = (days % 7);
		if (days == 6) {
			System.out.println(1);
		} else {
			System.out.println(d + 2);
		}
		System.out.println(days + "----------------------");
		System.out.println(d + "----------------------");
	}




}



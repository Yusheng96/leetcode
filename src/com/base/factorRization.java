package com.base;

import java.util.ArrayList;

public class factorRization {
	public static ArrayList<Integer> factorization(int n) {
		// write code here
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				res.add(i);
				n /= i;
				i--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime(); //获取开始时间  System.currentTimeMillis(); //获取开始时间 毫秒/纳秒

		ArrayList<Integer> list = factorization(24);
		for (int fac : list) {
			System.out.print(fac + " ");
		}

		long endTime = System.nanoTime(); //获取结束时间

		System.out.println("\n" + "程序运行时间：" + (endTime - startTime) + "ns"); //输出程序运行时间

	}
}

package com.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//分解质因素，输出。 8-->2*2*2
public class FactorRization2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int max = num;
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < max; i++) {
			if (num % i == 0) {
				num = num / i;
				sb.append(i + "*");
				//System.out.print(i + "*");

				if (num % i == 0) {
					i--;
				}
			}

			if (num < i) {
				break;
			}
		}
		String str = sb.toString();
		for (int i = 0; i < str.length() - 1; i++) {
			System.out.print(str.charAt(i));
		}

	}
}
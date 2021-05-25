package com.base;

import java.util.Scanner;

public class MeiTuantest {
	//2.切蛋糕-0.45；1.优美的字符串-0.18；3.-0.18 4.-0.27
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int i= scan.nextInt();
		int len = 0;
		String str = null;
		try {
			str = scan.nextLine();
			len = Integer.parseInt(str);
		} catch (Exception e) {
			if (str.equals("")) {
				System.out.println("输入不能为空，请检查后重新输入！");
			} else {
				System.out.println("您的输入有误，请检查后重新输入！");
			}
		}
		if (len > 10) {
			System.out.println("订单个数超出题目要求范围，请检查后重新输入！");
			System.exit(0);
		}
		String[] n = new String[len];
		for (int i = 0; i < len; i++) {
			String s = scan.nextLine();
			if (s.equals("")) {
				System.out.println("输入尾号不能为空，请重新输入！");
				System.exit(0);
			}
			for (int j = 0; j < s.length(); j++) {
				if (!Character.isDigit(s.charAt(j))) {
					System.out.println("输入尾号不为数字，请重新输入！");
					System.exit(0);
				}
			}
			if (s.length() != 4) {
				System.out.println("输入尾号不符合规范，请重新输入！");
				System.exit(0);
			}
			n[i] = s;
		}
		fun(n);
	}

	// 得到分数
	public static int getGrade(String n) {
		int[] temp = new int[4];
		for (int i = 0; i < 4; i++) {
			temp[i] = n.charAt(i) - '0';
		}
		return conditionOne(temp) + conditionTwo(temp) + conditionThree(temp) + conditionFour(temp);
	}

	//第一种情况：如果出现连号，不管升序还是降序，都加5分。例如：5678,4321都满足加分标准。
	private static int conditionOne(int[] temp) {
		for (int i = 1; i < 4; i++) {
			if (temp[0] + 1 == temp[1] && temp[1] + 1 == temp[2] && temp[2] + 1 == temp[3] || temp[0] - 1 == temp[1] && temp[1] - 1 == temp[2] && temp[2] - 1 == temp[3]) {
				return 5; // 1.出现连号 +5分
			}
		}
		return 0;
	}

	//第二种情况：前三个数字相同，或后三个数字相同，都加3分。例如：4888,6665,7777都满足加分的标准。
	private static int conditionTwo(int[] temp) {
		int x = 0;
		if (temp[0] == temp[1] && temp[1] == temp[2]) {
			x += 3; // 2.三个数字相同 (前三)+3分
		}
		if (temp[1] == temp[2] && temp[2] == temp[3]) {
			x += 3; // 2.三个数字相同 (后三)+3分
		}
		return x;
	}

	//第三种情况：符合AABB或者ABAB模式的加1分。例如：2255,3939,7777都符合这个模式，所以都被加分。
	private static int conditionThree(int[] temp) {
		int x = 0;
		if (temp[0] == temp[1] && temp[2] == temp[3]) {
			x += 1; // 3.AABB模式 +1分
		}
		if (temp[0] == temp[2] && temp[1] == temp[3]) {
			x += 1; // 3.ABAB模式 +1分
		}
		return x;
	}

	//第四种情况：含有：6，8，9中任何一个数字，每出现一次加1分。例如4326,6875,9918都符合加分标准。其中，6875被加2分；9918被加3分。
	private static int conditionFour(int[] temp) {
		int x = 0;
		for (int i : temp) {
			if (i == 6 || i == 8 || i == 9) {
				x += 1;
			}
		}
		return x;
	}

	//  取得每一行分数并输出
	public static void fun(String[] n) {
		try {
			for (String x : n) {
				System.out.println(getGrade(x));
			}
		} catch (Exception e) {
			System.out.println("您的输入有误，请检查后重新输入！");
		}
	}
}
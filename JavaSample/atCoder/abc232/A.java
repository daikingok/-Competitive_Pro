package abc232;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] str = S.split("");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[2]);
		System.out.println(a*b);
	}

}

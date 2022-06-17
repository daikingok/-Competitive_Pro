package abc239;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double H = sc.nextDouble();
		double num = H *(12800000 + H);
		System.out.println(Math.sqrt(num));
	}

}

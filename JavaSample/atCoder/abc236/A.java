package abc236;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long max = (long)Math.pow(2, 31);
		long min = (long)Math.pow(-2, 31);
		if(min <= N &&  N <max) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

package abc256;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1;
		for(int i=0; i<N; i++) {
			ans *= 2;
		}
		System.out.println(ans);
			

	}

}

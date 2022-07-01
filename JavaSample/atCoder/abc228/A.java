package abc228;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int S  = sc.nextInt();
		int T = sc.nextInt();
		int X = sc.nextInt();
		if(S == 0) {
			S = 24;
		}
		if(T ==0) {
			T = 24;
		}
		if(X == 0) {
			X = 24;
		}
		if(S <= X && X <= T) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

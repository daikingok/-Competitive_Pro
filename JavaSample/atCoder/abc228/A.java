package abc228;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int S  = sc.nextInt();
		int T = sc.nextInt();
		int X = sc.nextInt();
		
		if(S < T) {
			if(S <= X && X  < T ) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			if(X >= S || X < T) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}

package abc218;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		if(S.charAt(N-1) == 'o') {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}

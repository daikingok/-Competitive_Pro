package abc220;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//K進数表記
		String K = sc.next();
		String A = sc.next();
		String B = sc.next();
		int k = Integer.parseInt(K);
		//n進数から10進数への変換
		Long a_10 = Long.parseLong(A,k);
		Long b_10 = Long.parseLong(B,k);
		
		System.out.println(a_10*b_10);
	}

}

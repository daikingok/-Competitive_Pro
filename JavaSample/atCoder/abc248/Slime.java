package abc248;

import java.util.Scanner;

public class Slime {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long K = sc.nextInt();
		int c =0; 
		while(A < B) {
			A = A*K;
			c++;
		}
		System.out.println(c);
	}

}

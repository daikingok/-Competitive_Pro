package abc227;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A = sc.nextInt();
		for(int i =1; i<=K-1; i++) {
			
			A++;
			if(A > N) {
				A = 1;
			}
			
		}
		System.out.println(A);
		
		
	}

}

package abc245;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//Takahashi
		//hour
		int A =  sc.nextInt();
		//min
		int B = sc.nextInt();
		//Aoki
		//hour
		int C = sc.nextInt();
		//min
		int D = sc.nextInt();
		
		if(A <  C) {
				System.out.println("Takahashi");
		}else if(A > C) {
				System.out.println("Aoki");
		}else if(A == C) {
			
			if(B > D) {
				System.out.println("Aoki");
			}else if(B <=  D) {
				System.out.println("Takahashi");
			}
		}
	}

}

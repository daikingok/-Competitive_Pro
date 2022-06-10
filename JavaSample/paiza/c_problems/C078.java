    package c_problems;

import java.util.Scanner;

public class C078 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N, c_1,c_2;
		N = sc.nextInt();
		c_1 = sc.nextInt();
		c_2 = sc.nextInt();
		int money=0;
		int mochikabu=0;
		
		int P;
		
		for(int i=0; i<N; i++) {
			P = sc.nextInt();
			if(i != N-1) {
				if(P <= c_1) {
					money -= P;
					mochikabu++;
				}else if(P >= c_2) {
					money += mochikabu*P;
					mochikabu = 0;
				}else if(c_1 < P && P < c_2) {
					
				}
			}else {
				money += mochikabu *P;
			}
			System.out.println(i);
			System.out.println(money);
		}
		
	}

}

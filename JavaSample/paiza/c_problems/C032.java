package c_problems;

import java.util.Scanner;

public class C032 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int food =0;
		int wear =0;
		int book =0;
		int any =0;
		
		
		
		for(int i=0; i<N; i++) {
			int type = sc.nextInt();
			int money = sc.nextInt();
			
			if(type == 0 ) {
				food += money;
			}else if(type == 1) {
				book += money;
			}else if(type == 2) {
				wear += money;
			}else if(type == 3) {
				any += money;
			}
		}
		System.out.println(food / 100 *5 +book / 100* 3 + wear / 100* 2+ any / 100* 1);
	}

}

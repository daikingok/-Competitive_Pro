package abc220;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt(); 
		int C = sc.nextInt();
		int ans = 0;
		boolean flg = false;
		for(int i=1; ans<=C; i++) {
			ans = i*C;
			if(A <= ans && ans <= B) {
				System.out.println(ans);
				flg = true;
				break;
			}
		}
		if(!flg) {
			System.out.println(-1);
		}
	}

}

package abc259;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//現在の年齢
		int N = sc.nextInt();
		//この年の慎重を求める
		int M = sc.nextInt();
		//この年から現在の年齢まで身長伸びていない
		int X = sc.nextInt();
		//現在の身長
		int T = sc.nextInt();
		//毎年の伸び
		int D = sc.nextInt();
		
		if(X < M && M <= N) {
			System.out.println(T);
//		}else if(M == 0){
//			if(T -D <=  0) { 
//				System.out.println(1);
//			}else {
//				System.out.println(T-D);
//			}
//		}
	}else if(0 <= M && M <= X) {
			int ans  = (T-D*X) + (D*M); 
			System.out.println(ans);
		}
	}	

}

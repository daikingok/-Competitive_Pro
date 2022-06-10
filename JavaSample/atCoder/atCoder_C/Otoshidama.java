package atCoder_C;

import java.util.Scanner;

public class Otoshidama {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Y =sc.nextInt();
		boolean flg = false;
		
		//全探索
		for(int i=0; i<=N; i++) {
			for(int j =0; j+i<=N; j++) {
				//3個目のfor文は2つめの値が決まればあと1つはわかるため必要ない
				int t = N-i-j;
					//枚数が一致しているか
					if( i+j+t == N ) {
						int sum = 10000*i + 5000*j + 1000*t;
						if(sum == Y) {
							flg= true;
							System.out.println(i+" "+j+" "+t);
							return;
						}
						
				}
			}
		}
		
		if(!flg) {
			System.out.println("-1 -1 -1");
		}
	}

}

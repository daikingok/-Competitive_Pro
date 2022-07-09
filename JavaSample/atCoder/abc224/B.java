package abc224;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] array = new int[H][W];
		//2次元配列
		for(int i = 0; i<H; i++) {
			for(int j =0; j<W; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		boolean flg = true;
		//条件式作成
		for(int i1=0; i1<H-1; i1++) {
			for(int i2 = i1+1; i2<H; i2++ ) {
				for(int j1=0; j1<W-1; j1++) {
					for(int j2=j1+1; j2<W; j2++) {
						int left = array[i1][j1] + array[i2][j2];
						int right = array[i2][j1] + array[i1][j2];
						
						if(left > right) {
							flg = false;
							break;
						}
					}
				}
			}
		}
		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}

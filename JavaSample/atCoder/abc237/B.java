package abc237;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] array = new String[H*W];
		for(int i=0; i<H*W; i++) {
			array[i] = sc.next();
		}
		String[][] ans = new String[W][H];
		int c = 0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				ans[j][i] = array[c];
				c++;
			}
		}
		for(int i=0; i<W; i++) {
			for(int j=0; j<H; j++) {
				System.out.print(ans[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

package abc255;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int[][] array = new int[2][2];
		for(int i =0;i<2;i++) {
			for(int j =0;j<2;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println(array[R-1][C-1]);
	}

}

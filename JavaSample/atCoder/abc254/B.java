package abc254;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		   int N = sc.nextInt();
		   int[][] array = new int[N][N];
		   for(int i=0; i<N; i++) {
				   for(int j=0; j<=i; j++) {
					  //1行目出力
					   if(j== 0  || j == i) {
						   array[i][j] = 1;
					   }else {
						   array[i][j] = array[i-1][j] + array[i-1][j-1];
					   }
						   System.out.print(array[i][j] + " ");
				   }
				   System.out.println();
		   }
	}

}

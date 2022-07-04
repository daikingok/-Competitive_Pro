package abc238;

import java.util.Arrays;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+2];
		A[0] = 0;
		A[1] = 360;
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			int b = sc.nextInt();
			sum += b;
			A[i+2] = sum%360;
		}
		Arrays.sort(A);
		int max=0;
		//0以外の配列の要素分ループ
		for(int i=0; i<N+1; i++) {
			max = Math.max(max, A[i+1]-A[i]);
		}
		System.out.println(max);
	}

}

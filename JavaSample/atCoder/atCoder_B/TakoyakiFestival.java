package atCoder_B;

import java.util.Scanner;

public class TakoyakiFestival {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int[N];
		int sum = 0;
		
		for(int t =0; t< N; t++) {
			A[t] = sc.nextInt();
		}
		int pattern = N * (N-1) / 2;
		for(int i=0; i<N; i++) {
			for(int j =0; j<N-1; j++) {
				if(i != j && i >=  j) {
//					System.out.println("i: " +i);
//					System.out.println("j: " +j);
					 int pow = A[i] * A[j];
					 sum  += pow;
				}
			}
		}
		System.out.println(sum);

	}

}

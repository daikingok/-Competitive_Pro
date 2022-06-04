package atCoder_B;

import java.util.Scanner;

public class PapersPlease {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i=0; i<N; i++) {
			A[i]  = sc.nextInt();
		}
		for(int j=0; j<A.length; j++) {
			if(A[j] % 2 ==0 && !(A[j] % 3 == 0 ||A[j] % 5== 0)) {
					System.out.println("DENIED");
					return;
			}
		}
		System.out.println("APPROVED");
	}

}

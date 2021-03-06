package abc251;

import java.util.HashSet;
import java.util.Scanner;

public class AtMost {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int W = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		//重複する値を持たないリスト
		HashSet<Integer> hash = new HashSet<Integer>();
		int sum = 0;
		if(N ==1) {
			//おもり一つのケース
			for(int i=0; i<N; i++) {
				if(A[i] <= W ) {
					hash.add(A[i]);
				}
			}
		}
		if(N == 2) {
			//おもり一つのケース
			for(int i=0; i<N; i++) {
				if(A[i] <= W ) {
					hash.add(A[i]);
				}
			}
			//おもり2つのケース
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					sum= A[i]+A[j] ;
					if(sum <=  W) {
						hash.add(sum);
					}
				}
			}
		}
		if(N >= 3) {
			//おもり一つのケース
			for(int i=0; i<N; i++) {
				if(A[i] <= W ) {
					hash.add(A[i]);
				}
			}
			//おもり2つのケース
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					sum= A[i]+A[j] ;
					if(sum <=  W) {
						hash.add(sum);
					}
				}
			}
			//おもり3つのケース
			for(int i=0; i<N-2; i++) {
				for(int j=i+1; j<N-1; j++) {
					for(int t=j+1; t<N; t++) {
						sum = A[i]+A[j]+A[t];
						if(sum <= W) {
							hash.add(sum);
						}
					}
				}

			}
		}

		System.out.println(hash.size());
	}
}

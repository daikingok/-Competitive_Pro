package b_problem;

import java.util.Scanner;

public class B073 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] tree = new int[N];
		for(int i=0; i<N; i++) {
			tree[i] = sc.nextInt();
		}

		int Q = sc.nextInt();

		for(int t =0; t<Q; t++) {
			int sum =0;
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			int s =num-1;
			int e = num2-1;
			
			//ツリーの合計値を求める
			for(int j=s; j<=e; j++) {
				sum += tree[j];	
			}
			int want = sum /(e-s+1);
			if(want < M) {
				for(int k=s; k<=e; k++) {
					tree[k] += M - want;
				}
			}

		}

		for(int a =0; a<N; a++) {
			if(a != N-1) {
				System.out.print(tree[a]+" ");
			}else {
				System.out.print(tree[a]);
			}
			
		}
	}

}

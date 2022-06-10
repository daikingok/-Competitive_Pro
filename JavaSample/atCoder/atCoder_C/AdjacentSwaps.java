package atCoder_C;

import java.util.Scanner;

public class AdjacentSwaps {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int N,Q;
		N = sc.nextInt();
		Q = sc.nextInt();
		
		int[] A = new int[N];
		int count =1;
		//1からNまでの配列を作成
		for(int i = 0; i<N; i++) {
			A[i] = count;
			count++;
		}
		//処理番号を受け取る配列numを作成
		int[] num = new int[Q];
		for(int t =0; t<Q; t++) {
			num[t] = sc.nextInt();
		}
		int sum=0;
		//j =4;
		for(int j =0; j<num.length; j++) {
			//一番右だった場合とそれ以外の条件分岐
			if(num[j]  == A[N-1] ) {
			//入れかえる数字を受け取る変数を作成
			int change = A[num[j] -1];
			//chage=4
			//num[j] =5
				A[num[j]-1] = A[num[j]-2];
				A[num[j]-2] = change;
				
				
			}else {
				int change = A[num[j] -1];
				A[num[j]] = A[num[j] +1];
				A[num[j] + 1] =  change;
			   
			}
			System.out.println(sum);
			sum++;
			
		}
		for(int k=0; k<N; k++) {
			System.out.print(A[k]+" ");
		}
		
	}

}

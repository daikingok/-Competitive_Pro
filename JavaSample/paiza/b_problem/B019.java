package b_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class B019 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int K  = sc.nextInt();
		int[][] array = new int[N][N];
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i= 0; i<N;i++) {
			for(int j=0; j<N; j++) {
				array[i][j] = sc.nextInt();
				//System.out.println(array[i][j] );
			}
		}
		int pic = (N/K)*(N/K);
		//System.out.println(pic);
		int C =0;
		int D =0;
		while(list.size() != pic) {
			System.out.println("list.size(): "+list.size());
			int sum =0;
			for(int i= C; i<K+C;i++) {	
				for(int j=D; j<K+D; j++) {

				}
			}
		}
		//list.add(sum);
		//System.out.println(sum);


	}
}



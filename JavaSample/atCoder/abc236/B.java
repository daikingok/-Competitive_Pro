package abc236;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				int[] array = new int[4*N-1];
				int[] sum = new int[N];
				for(int i=0; i<4*N-1; i++) {
					array[i] = sc.nextInt();
					sum[array[i]-1]++;
				}
				for(int i=0; i<N;i++) {
					if(sum[i] == 3) {
						System.out.println(i+1);
						return;
					}
				}
				
	}

}

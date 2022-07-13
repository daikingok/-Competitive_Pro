package abc222;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		int[] a = new int[N];
		int count = 0;
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
			if(a[i] < P) {
				count++;
			}
		}
		System.out.println(count);
	}

}

package abc225;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0; i<N-1; i++) {
			int num1 = sc.nextInt()-1;
			int num2 = sc.nextInt()-1;
			array[num1]++;
			array[num2]++;
		}
		boolean flg = false;
		for(int ans : array) {
			if(ans == N-1) {
				flg = true;
			}
		}
		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

package abc226;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer[]>list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			//配列内の要素
			int L = sc.nextInt();
			Integer[] array = new Integer[L];
			for(int j=0; j<L; j++) {
				array[j] = sc.nextInt();
			}
		}
	}

}

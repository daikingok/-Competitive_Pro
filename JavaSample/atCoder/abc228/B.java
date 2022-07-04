package abc228;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			A[i] = num; 
		}
		Set<Integer> list = new HashSet<>();
		list.add(X);
		//無限ループ
		while(true) {
//			System.out.println(A[X-1]);
			//listに含まれているかどうか
			if(!list.contains(A[X-1])) {
				list.add(A[X-1]);
				X = A[X-1];
			}else {
				break;
			}
		}
		System.out.println(list.size());
	}

}

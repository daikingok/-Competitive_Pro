package abc227;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 1; i<=1000; i++) {
			for(int j=1; j<=1000;j++) {
				set.add((4*i*j)+(3*i)+(3*j));
			}
		}
		int count = 0;
		for(int i=0; i<N; i++) {
			int ans = sc.nextInt();
			if(!set.contains(ans)) {
				count++;
			}
		}
		System.out.println(count);
	}

}

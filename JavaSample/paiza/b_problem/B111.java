package b_problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B111 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		Set<Integer> B  = new HashSet<Integer>();;
		
		int[] array = new int[100];
		for(int i=0; i<N; i++) {{
			array[i] = sc.nextInt();
		}
		for(int t=0; t<N; t++) {
			for(int j =0; j<N; j++) {
				if(t != j) {
					System.out.println(array[t]);
					System.out.println(array[j]);
					B.add(array[t]+array[j]);
				}
			}
		}
			
		}
	}

}

package abc243;

import java.util.Arrays;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		Integer[] B = new Integer[N];
		int fir =0;
		int sec = 0;
		for(int i=0; i<N;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N;i++) {
			B[i] = sc.nextInt();
			int num = B[i];
			if(A[i].equals(B[i])) {
				fir++;
//				System.out.println("A= "+A[i]);
//				System.out.println("B= "+B[i]);
			}else { 
				if(Arrays.asList(A).contains(num)){
					if(A[i] != B[i]) {
						sec++;
					}
				}
			}
		}
		System.out.println(fir);
		System.out.println(sec);

	}

}

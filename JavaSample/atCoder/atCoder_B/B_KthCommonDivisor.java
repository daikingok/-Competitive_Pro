package atCoder_B;

import java.util.Scanner;

public class B_KthCommonDivisor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		Integer[] ans = new Integer[100];
		int c = 0;
		int s;
		if(A >= B) {
			s = B;
		}else {
			s = A;
		}
		//System.out.println("s: "+s);
		for(int i=1; i<=s; i++) {
			
			if(A % i ==0 && B % i == 0) {
//				System.out.println("i: "+i);
				ans[c] = i;
//				System.out.println("c: "+c+" ans[c]:  "+ans[c]);
				c++;
			}
		}
		System.out.println(ans[c-K]);
	}

}

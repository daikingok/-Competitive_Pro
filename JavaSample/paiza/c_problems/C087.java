package c_problems;

import java.util.Scanner;

public class C087 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int reverse =  0;

		int ans = N;
		int sum =0;
		while(true) {
			for(int i = N; 0 < N; N /= 10) {
				int j = N % 10;
				System.out.println("N: "+N);
				if(N >= 1000) {
					sum += j*1000;
				}else if (100 <= N && N <1000) { 
					sum += j*100;
				}else if(10 <= N && N < 100) {
					sum += j*10;
				}else {
					sum += j;
				}
				System.out.println("sum: "+sum);		
			}
			if(ans  == sum) {
				System.out.println(sum);
				break;
			}else {
				ans += sum;
				sum = 0;
				System.out.println("ans: "+ans);
				N = ans;
			}
		}

	}

}

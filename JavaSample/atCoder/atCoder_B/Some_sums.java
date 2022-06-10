package atCoder_B;

import java.util.Scanner;

public class Some_sums {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,N;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
	
		int ans =0;
		
		for(int i= 1;i<=N; i++) {		
			
			int sum =0;
			int n  = i;
			while(n >0) {
				sum += n % 10;
				n /= 10;
			}
			
			if(sum >= a && sum <= b) {
				ans += i;
			}
		}
		
		System.out.println(ans);
	}

}

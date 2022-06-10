package atCoder_B;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,c,x;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		
		int sum;
		int count = 0;
		
		for(int i=0;i<a+1;i++) {
			for(int j=0;j<b+1;j++) {
				for(int t=0;t<c+1; t++) {
					sum = 500*i + 100*j + 50*t;
					if(sum == x) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}

package atCoder_B;

import java.util.Scanner;

public class B_105 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for(int j=1; j<=N ; j+=2) {
			if(yakusuu(j) == 8) {
				sum++;
			}
			
		}
		System.out.println(sum);
		
	}
	
	static int yakusuu(int a) {
		int count =0;
		for(int i=1; i<=a ; i++) {
			if(a % i == 0) {
				count++;
			}
		}
		return count;
	}

}

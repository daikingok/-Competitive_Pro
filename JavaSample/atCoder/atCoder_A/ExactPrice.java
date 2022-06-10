package atCoder_A;

import java.util.Scanner;

public class ExactPrice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		String str  = "No";
		for(int i=100; i<=1000; i+=100) {
			if(X == i ) {
				str = "Yes";
				break;
			}
		}
		System.out.println(str);
	}

}

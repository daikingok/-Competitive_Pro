package abc250;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int R = sc.nextInt();
		int C  = sc.nextInt();
		int count = 4;
		if(R == 1) {
			count--;
		}
		if(R == H) {
			count--;
		}
		if(C == 1) {
			count--;
		}
		if(C == W) {
			count--;
		}
		System.out.println(count);
		
	}

}

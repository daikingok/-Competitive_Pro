package atCoder_A;

import java.util.Scanner;

public class A_Median {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(median(a,b,c) == b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
	static int median(int x, int y, int z) {
		if(x >= y) {
			if(y >= z) {
				return y;
			}else if(x <= z) {
				return x;
			}else {
				return z;
			}
		}else if(x > z) {
			return x;

		}else if(y > z) {
			return z;
		}else {
			return y;
		}

	}
}

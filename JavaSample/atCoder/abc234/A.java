package abc234;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ft  = f_ceil(t);
		int ftplust = ft + t;
		int fftplust = f_ceil(ftplust);
		int fft = f_ceil(ft);
		System.out.println(f_ceil(fftplust+fft));
		

	}
	private static int f_ceil(int x) {
		int sum = x*x + 2*x + 3;
		return sum;
	}

}

package abc242;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		double X = sc.nextInt();
		if(A  >= X) {
			System.out.println(1);
		}else if(A < X && B >= X) {
			double  sum =  C / (B-A);
			System.out.println(sum );
		}else {
			System.out.println(0);
		}
	}
}

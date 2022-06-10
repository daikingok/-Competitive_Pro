package abc246;

import java.util.Scanner;

public class GetCloser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		
		//2点間の距離
		double dis = dist(0,0, A, B);
		System.out.print(String.format("%.10f", A / dis)+" "+String.format("%.10f", B/ dis));
	}
private static double dist(double x1, double y1, double x2, double y2) {
	double l;
	double dx = x2 - x1;
	double dy = y2- y1;
	//2点間の距離
	l = Math.sqrt( dx * dx + dy * dy );
	
	return l;
}
}

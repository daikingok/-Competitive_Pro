package abc259;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		int d= sc.nextInt();
		
		double rajian = Math.toRadians(360-d);
		double sin = Math.sin(Math.PI / rajian);
		double cos = Math.cos(Math.PI / rajian);
		
		
		
		
		
		System.out.println(a*cos + b*sin);
		System.out.println(b*cos + a*sin);
	}

}

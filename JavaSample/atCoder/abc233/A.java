package abc233;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int count = 0;
		while(X < Y) {
			X+= 10;
			count++;
		}
		System.out.println(count);
	
	}

}

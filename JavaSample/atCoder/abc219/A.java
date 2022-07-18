package abc219;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 0;
		if(0 <= X && X <40) {
			ans = 40 -X;
			System.out.println(ans);
		}else if(40 <= X && X < 70) {
			ans = 70-X;
			System.out.println(ans);
		}else if(70 <= X && X < 90) {
			ans = 90 -X;
			System.out.println(ans);
		}else {
			System.out.println("expert");
		}
		
	}

}

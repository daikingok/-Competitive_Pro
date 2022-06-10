package atCoder_A;

import java.util.Scanner;

public class Poor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			int a, b, c;
			Scanner sc = new Scanner(System.in);
			
			a =sc.nextInt();
			b =sc.nextInt();
			c =sc.nextInt();
			
			if(a == b && b == c && a ==c) {
				System.out.println("No");
			}else if(a != b && b!= c&& a!= c){
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
	}

}

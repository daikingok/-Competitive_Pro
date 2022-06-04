package atCoder_B;

import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			int a, b;
			Scanner sc = new Scanner(System.in);
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a < b) {
				for(int i = 0; i< b; i++) {
					System.out.print(a);
				}
			}else if(a > b) {
				for(int i = 0; i< a; i++) {
					System.out.print(b);
				}
			}else {
				for(int i = 0; i< a; i++) {
					System.out.print(b);
				}
			}
	}

}

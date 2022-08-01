package abc262;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mod = num %4;
		switch(mod) {
				case 0:
					System.out.println(num+2);
					break;
				case 1:
					System.out.println(num+1);
					break;
				case 2:
					System.out.println(num);
					break;
				case 3:
					System.out.println(num+3);
		}
		
			
	}

}

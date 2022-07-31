package abc215;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String hello = "Hello,World!";
		String str = sc.next();
		if(hello.equals(str)) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
		
	}

}

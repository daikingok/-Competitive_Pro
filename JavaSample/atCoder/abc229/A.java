package abc229;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ab = a+b;
		//System.out.println(ab);
		if(ab.equals(".##." ) || ab.equals("#..#" )) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}

package abc235;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] array = new int[3];
		String[] s = str.split("");
		for(int i=0; i<3; i++) {
			array[i] = Integer.parseInt(s[i]);
		}
		int a = array[0];
		int b = array[1];
		int c = array[2];
		int abc = a*100 + b*10 + c;
		int bca = b*100 + c*10 + a;
		int cab = c*100 + a*10 + b;
		System.out.println(abc);
		System.out.println(bca);
		System.out.println(cab);
		System.out.println(abc+ bca + cab);
		
	}

}

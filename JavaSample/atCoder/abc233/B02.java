package abc233;

import java.util.Scanner;

public class B02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		String str = sc.next();
		
		String top = str.substring(0, L-1);
		String middle = reverse(str.substring( L-1, R));
		String end = str.substring(R, str.length());
//		System.out.println(top);
//		System.out.println(middle);
//		System.out.println(end);
		System.out.println(top+middle+end);
	}
	private static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		s = sb.reverse().toString();
		return s; 
	}

}

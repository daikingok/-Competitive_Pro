package c_problems;

import java.util.Scanner;

public class C034 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String  a = sc.next();
		String str = sc.next();
		String b =sc.next();
		String equal =sc.next();
		String c =sc.next();
		
		int sum =0;
		
		if(a.contains("x")) {
			 sum = Integer.parseInt(c) + Integer.parseInt(b);
		}else if(b.contains("x")) {
			 sum = Integer.parseInt(a) - Integer.parseInt(c);
		}else if(c.contains("x") ) {
			 sum = Integer.parseInt(a) +  Integer.parseInt(b);
		}
			
		System.out.println(sum);
	}

}

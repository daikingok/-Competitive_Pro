package abc216;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		System.out.println(str);
//		String[] arr = str.split(".");
//		int num =Integer.parseInt(arr[0]);
//		int dou =Integer.parseInt(arr[1]);
//		System.out.println(num);
//		System.out.println(dou);
		int ind = str.indexOf(".");
		int num = Integer.parseInt(str.substring(0, ind));
		int dou  = Integer.parseInt(str.substring(ind+1));
		if(0 <= dou && dou <= 2)
		{
			System.out.println(num+"-");
		}else if(3 <= dou && dou <= 6) {
			System.out.println(num);
		}else if(7 <= dou && dou <= 9) {
			System.out.println(num+"+");
		}
	}
}

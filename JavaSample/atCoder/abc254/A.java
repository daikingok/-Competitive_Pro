package abc254;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		   
		   Scanner sc = new Scanner(System.in);
		   int N = sc.nextInt();
	        String number = String.valueOf(N);

	        char[] digits1 = number.toCharArray();
	        int length = digits1.length;
//	        for(int i = 0; i < digits1.length; i++) {
//	            System.out.println(digits1[i]);
//	        }
	        System.out.print(digits1[length-2]);
	        System.out.print(digits1[length-1]);
	}

}

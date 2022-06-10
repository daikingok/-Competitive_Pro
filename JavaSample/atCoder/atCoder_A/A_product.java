package atCoder_A;

import java.util.Scanner;

public class A_product {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b = sc.nextInt();
		
		int  sum = a*b;
		
		if ((a * b) % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
		
//		if(sum%2 == 0 ) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
	

}

package paiza;

import java.util.Scanner;

public class C061 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = 0;
		int len = 0;

		for(int i=1; (num1+num2)>0; i*=10,num1/=10,num2/=10,len++){
		  num3 += (num1 % 10 + num2 % 10) % 10 * i;
		}
		num3 %= 1000;
		len = len==0?1:len;
		len = len>3?3:len;

		System.out.printf("%0"+len+"d",num3);
	}

}

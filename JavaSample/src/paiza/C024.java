package paiza;

import java.util.Scanner;

public class C024 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			String str = sc.next();
			System.out.println(str);
			
			if(str.contains("SET")) {
				int which = sc.nextInt();
				int change = sc.nextInt();
				if(which ==  1) {
					num1 = change;
				}else {
					num2 = change;
				}
			}else if(str.contains("ADD")) {
				int change = sc.nextInt();
				num2 = num1+ change;
				
			}else if(str.contains("SUB")) {
				int change = sc.nextInt();
				num2 = num1- change;
			}
			System.out.println("num1 : "+num1);
			System.out.println("num2 : "+num2);
		}
	}

}

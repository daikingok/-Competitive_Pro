package abc258;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		if(K >= 60) {
			if(K-60 >=10) {
				System.out.println("22:"+(K-60));
			}else {
				System.out.println("22:0"+(K-60));
			}
		}else {
			if(K >= 10) {
				System.out.println("21:"+K);
			}else {
				System.out.println("21:0"+K);
			}
		}
	}

}

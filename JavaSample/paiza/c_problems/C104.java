package c_problems;

import java.util.Scanner;

public class C104 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();


		boolean flg = true;
		int ten_a=0;
		int ten_b=0;
		int i=1;

		loop: while(i < 10) {
			for(int j=0; j<10; j++) {
				int aa =  i*10 +j;
				int sum = aa*j;


				int ans = a*100 + i*10+ b;
				if(sum == ans ) {
					ten_a = i;
					ten_b = j;
					flg = true;
					break loop;
				}else {
					flg = false;
				}
			}
			i++;
		}


		if(flg) {
			System.out.println(ten_a+" "+ten_b);
		}else {
			System.out.println("No");
		}

	}

}

package atCoder_A;

import java.util.Scanner;

public class Placing_Marbles {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String num;
		String[] s = new String[3];
		
		num = sc.next();

		s = num.split("");
		
		//カウンタ
		int count = 0;
		for(int i=0; i<3; i++) {
//			System.out.println(s[i]);
			if(Integer.parseInt(s[i]) == 1) {		
				count++;
			}
		}
		System.out.println(count);



	}

}

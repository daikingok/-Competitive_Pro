package abc230;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S  =sc.next();
		String T = "oxx";
		for(int i=0; i<10; i++) {
			T += T;
			//System.out.println(T);
		}
		if(T.contains(S)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}

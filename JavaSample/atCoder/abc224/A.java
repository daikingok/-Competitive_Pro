package abc224;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.length() <= 2) {
			if(S.contains("er")){
				System.out.println("er");
			}
		}else {
			int len = S.length();
			String ist = S.substring(len-3, len);
			String er = S.substring(len-2, len);
			if(ist.contains("ist")) {
				System.out.println("ist");
			}else if(er.contains("er")){
				System.out.println("er");
			}
		}
	}

}

package abc251;

import java.util.Scanner;

public class SixCharacters {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans = "";
		while(ans.length() < 6) {
			ans += S;
		}
		System.out.println(ans);
	}

}

package abc218;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[26];
		for(int i=0; i<26; i++) {
			int asc = sc.nextInt();
			int ans = asc + 96;
			//asciiではaが97のため
			ch[i] = (char)ans;
			System.out.print(ch[i]);
		}
	}

}

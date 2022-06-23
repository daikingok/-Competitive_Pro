package abc236;

import java.util.Scanner;

public class chokudai {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[] str = S.toCharArray();
		
		char change = str[a-1];
		str[a-1] = str[b-1];
		str[b-1] = change;
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]);
		}
		
	}

}

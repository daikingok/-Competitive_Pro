package abc219;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		for(int i=0; i<3; i++) {
			str[i] = sc.next();
		}
		String t = sc.next();
		String[] arr1 = t.split("");
		String ans = "";
		//出力順の配列作成
		for(String s :arr1) {
			ans += str[Integer.parseInt(s)-1];
		}
		System.out.println(ans);
	}

}

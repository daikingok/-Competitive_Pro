package abc258;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		for(int i = 0; i<Q; i++) {
			int q = sc.nextInt();
			int t = sc.nextInt();

			if(q == 1) {
					S = str_to_rst(S, t);
			}else {
				System.out.println(S.charAt(t-1));
			}
		}
	}
	private static String str_to_rst(String s, int i) {
		//移動分の文字列を取得
		String moji = s.substring(s.length()-i);
//		System.out.println("moji= "+moji);
		s = moji + s.substring(0, s.length()-i);
		return s;
	}

}

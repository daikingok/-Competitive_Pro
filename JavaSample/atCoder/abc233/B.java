package abc233;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		
		String str = sc.next();
		 sc.close();
		String[] spl = str.split("");
		
		//対象箇所の抜き出し　逆引き
		String rev = "";
		for(int i=L-1; i<R; i++) {
			rev += spl[i];
			spl[i] = "";
		}
		StringBuilder sb = new StringBuilder(rev);
		rev = sb.reverse().toString();
		//System.out.println(rev);
		
		String ans = "";
		for(int i=0; i<spl.length; i++) {
			if(i != L-1) {
				ans += spl[i];
			}else {
				ans += rev;
			}
			
		}
		System.out.println(ans);
	}

}

package abc221;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		boolean flg = false;
		if(S.equals(T)) {
			System.out.println("Yes");
		}else {
			
			//文字の並べ替え
			for(int i=0; i < S.length()-1; i++) {
				char[] c = S.toCharArray();
				char ch = c[i];
				c[i] = c[i+1];
				c[i+1] = ch;
				String str = new String(c);
				if(judge(str,T)) {
					System.out.println("Yes");
					flg = true;
					break;
				}
			}
			if(!flg) {
				System.out.println("No");
			}
		}

	}
	public static boolean  judge(String a, String b) {
		if(a.equals(b)) {
			return true;
		}else {
			return false;
		}
	}

}

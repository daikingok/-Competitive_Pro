package abc229;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		//桁数統一
		if(a.length() < b.length() ) {
			for(int i=0; i<b.length()-a.length() ; i++) {
				a = "0" + a;
			}
		}else {
			for(int i=0; i<a.length() -b.length(); i++) {
				b = "0" + b;
			}
		}
		String[] as = a.split("");
		String[] bs = b.split("");
		int[] a_num = new int[a.length()];
		int[] b_num = new int[b.length()];
		
		boolean flg = false;
		for(int i=0; i<as.length; i++) {
			a_num[i] = Integer.parseInt(as[i]);
			b_num[i] = Integer.parseInt(bs[i]);
			if(hanbetu(a_num[i], b_num[i])) {
				System.out.println("Hard");
				flg = true;
				break;
			}
		}
		if(!flg) {
			System.out.println("Easy");
		}


	}
	//各桁の和が10を超えるか判別
	private static boolean hanbetu(int a, int b) {
		if(a + b >= 10) {
			return true;
		}else {
			return false;
		}
	}

}

package atCoder_B;

import java.util.Scanner;

public class StringsWiththeSmaeLength {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String S = sc.next();
		String T = sc.next();
		
		String[] s = S.split("");
		String[] t = T.split("");
		
		for(int i=0; i<N; i++) {
			System.out.print(s[i]);
			System.out.print(t[i]);
		}
	}

}

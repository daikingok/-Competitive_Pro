package atCoder_B;

import java.util.Scanner;

public class CountABC {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		String[] s = S.split("");

		int count = 0;
		if(S.contains("ABC")) {
			for(int i=0; i<N-2; i++) {
				
				String hantei  = s[i] +  s[i+1] + s[i+2];
				if(hantei.contains("ABC")) {
						count++;
				}
			}
		}
		System.out.println(count);
	}

}

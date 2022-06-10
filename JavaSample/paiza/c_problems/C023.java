package c_problems;

import java.util.Arrays;
import java.util.Scanner;

public class C023 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String[] a= new String[6];
		
		for(int i=0; i<6; i++) {
			a[i] = sc.next();
		}

		int N = sc.nextInt();
		//String[][] array = new String[N][6];
		
		for(int t=0; t<N; t++) {
			if(t == N-1) {
				String Line = sc.next();
			}
			String Line = sc.nextLine();
			String[] lines = Line.split(" ");
			int count =0;
			for(int j=0; j<6; j++) {
					if(Arrays.asList(lines).contains(a[j])) {
						count++;
					}
			}
			System.out.println(t);
			System.out.println(Line);
		}
	}

}

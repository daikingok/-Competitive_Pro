package abc236;

import java.util.HashSet;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		 String[] S = new String[100009];
//		List<String> local = new ArrayList<String>();
		 HashSet<String> ex = new HashSet<String>();
		for(int i=0; i<N; i++) {
			S[i] = sc.next();
		}
		for(int i=0; i<M; i++) {
			ex.add(sc.next());
		}
		for(int i=0; i<N; i++) {
			if(ex.contains(S[i])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}

package abc257;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		char c = 'A';
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i < 26; i++){
			for(int j=0; j<N; j++) {
				list.add(c);
			}
		    c++;
		}
		int i=0;
//		for(char b : list) {
//			
//			System.out.println(i+"    "+b);
//			i++;
//		}
		System.out.println(list.get(X-1));
	}

}

package abc216;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> hash = new HashSet<>();
		for(int i=0; i<n+1; i++) {
			String name = sc.nextLine();
			hash.add(name);
		}
		if(hash.size() == n+1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}

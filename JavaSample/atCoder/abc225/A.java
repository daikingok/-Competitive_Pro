package abc225;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Set<Character> set = new HashSet<Character>();
		String s = sc.next();
		char[] array = s.toCharArray();
		for(char c : array) { 
			set.add(c);
		}
		int size = set.size();
		if(size == 1) {
			System.out.println(1);
		}else if(size == 2) {
			System.out.println(3);
		}else if(size == 3){
			System.out.println(6);
		}
	}

}

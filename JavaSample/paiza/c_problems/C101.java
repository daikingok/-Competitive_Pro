package c_problems;

import java.util.Scanner;

public class C101 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		String  a = sc.next();
		
		int count =0;
		for(int i=0; i<=365; i++) {
			String day =Integer.valueOf(i).toString();
			if(day.contains(a)) {
				count++;
			}
		}
		System.out.println(count);
	}

}

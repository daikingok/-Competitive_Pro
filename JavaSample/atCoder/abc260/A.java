package abc260;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] array = S.toCharArray();
		if(array[0] == array[1]) {
			if(array[1] == array[2]) {
				System.out.println(-1);
			}else {
				System.out.println(array[2]);
			}
		}else {
			if(array[1] == array[2]) {
				System.out.println(array[0]);
			}else {
				if(array[0] == array[2]) {
					System.out.println(array[1]);
				}else {
					System.out.println(array[0]);
				}
			}
		}
	}

}

package abc217;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] array = new String[2];
		String[] diff = new String[2];
		
		String one = sc.next();
		String two = sc.next();
		
		array[0] = one;
		array[1] = two;
		diff[0] = one;
		diff[1] =two;
		Arrays.sort(diff);
		
		if(array[0] == diff[0]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}

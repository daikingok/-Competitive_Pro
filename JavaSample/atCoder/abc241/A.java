package abc241;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i =0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		int fir = 0;
		int sec = array[fir];
		int thi = array[sec];
		int fou = array[thi];
		System.out.println(fou);
	}

}

package sample;

import java.util.Scanner;

public class c055 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//文字列の数
		int num = sc.nextInt();

		//抜き出す文字列
		String imp_str  = sc.next();

		//文字列の取得
		String[] array = new String[num];
		for(int i=0; i< num ; i++) {
			array[i] =  sc.next();
		}
		//表示されたかのカウント変数
		int count = 0;
		for(int i=0; i< num ; i++) {
			if(array[i].contains(imp_str)) {
				System.out.println(array[i]);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("None");
		}



	}

}

package abc247;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveRight {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String array[] = str.split("");
		List<String> list = new ArrayList<String>();
		list.add("0");
		for(int i =0; i<array.length-1; i++) {
			list.add(array[i]);
		}
		for(String s : list) {
			System.out.print(s);
		}
	}

}

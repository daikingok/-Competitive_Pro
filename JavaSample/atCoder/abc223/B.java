package abc223;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		List<String>list = shift(S);
		//辞書順にソート
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
	}
	//左にシフト
	private static List<String> shift(String str) {
		List<String>shiftlist = new ArrayList<>();
		
		char[] c = str.toCharArray();
		//対象文字
		for(int i=0; i<c.length; i++) {
			String  moji = str.substring(1, str.length());
			str = moji + String.valueOf(str.charAt(0));
			
			shiftlist.add(str);
		}
		
		return shiftlist;
	}

}

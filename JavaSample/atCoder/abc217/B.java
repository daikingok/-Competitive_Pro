package abc217;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>(); 
		list.add("ABC");
		list.add("ARC");
		list.add("AGC");
		list.add("AHC");
		for(int i=0; i<3; i++) {
			list.remove(sc.next());
		}
		for(String ans : list) {
			System.out.println(ans);
		}
	}

}

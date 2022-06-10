package c_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C058 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String  t = sc.next();
		String s =sc.next();
		
		String[] array = t.split("");
		String[] array2 = s.split("");
		
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		List<String> list2 = new ArrayList<String>(Arrays.asList(array2));
		int i=0; 
		
//		for (int i = 0; i < list.size(); i++) {
//		      System.out.println(list.get(i));
//		    }
//		for (int i = 0; i < list2.size(); i++) {
//		      System.out.println(list2.get(i));
//		    }
		
		
		while(!t.contains(s)) {
			String str = list2.get(0);
			//System.out.println(str);
			list2.remove(0);
			list2.add(str);
			s = String.join(",",list2).replace(",", "");
			
			i++;
		}
		System.out.println(i);
	}

}

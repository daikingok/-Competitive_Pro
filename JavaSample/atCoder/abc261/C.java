package abc261;

import java.util.HashMap;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String tmpString;
		Integer tmpInteger;
		int n= sc.nextInt();
		for(int i=0;i<n; i++) {
			tmpString = sc.next();
			if(map.get(tmpString)==null) {
				System.out.println(tmpString);
				map.put(tmpString, 0);
			}else {
				tmpInteger = map.get(tmpString)+1;
				System.out.println(tmpString+"("+tmpInteger+")");
				map.put(tmpString, tmpInteger);
			}
			
		}
	}

}

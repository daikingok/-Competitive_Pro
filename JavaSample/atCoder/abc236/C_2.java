package abc236;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<String, String> map = new HashMap<String,String>();
		for(int i=0; i<N; i++) {
			map.put(sc.next(), "No");
		}
		for(int j=0; j<M; j++) {
			String str = sc.next();
			if(map.containsKey(str)) {
				System.out.println(str);
				map.put(str, "Yes");
			}
		}
		for(Map.Entry<String, String> entry : map.entrySet()){
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}

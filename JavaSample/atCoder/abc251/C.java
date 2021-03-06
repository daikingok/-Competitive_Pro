package abc251;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		int N = sc.nextInt();
		String[] array = new String[N];
		for(int i=0; i<N; i++){
			String str = sc.next();
			array[i] = str;
			int t = sc.nextInt();
			if(!map.containsKey(str)) {
				map.put(str, t);
				//System.out.println("str = "+str+"   t= "+ t);
			}
		}
		//最大値とそのときのキーを初期化
		  String maxKey = null;
		  Integer maxValue = 0;

		//entrySetメソッドでマップのキーとValueを一つずつ取得
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

		//最大値とValueを比較してValueが大きければ、そのときのキーとValueを代入
		  if (entry.getValue() > maxValue) {
		    maxKey = entry.getKey();
		    maxValue = entry.getValue();
		  }
		}
		//maxValueにmap要素最初から一致している箇所があるかfor文
		for(int i=0; i<N; i++) {
			if(map.get(array[i]) == maxValue) {
				System.out.println(i+1);
				break;
			}
		}
	}

}

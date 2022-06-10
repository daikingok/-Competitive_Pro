package atCoder_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int N = sc.nextInt();
		String[] str = new String[5];
		
		for(int i =0; i<N;  i++) {
			String a = sc.next();
			//重複したキーが存在するか
			if(!map.containsKey(a)) {
				map.put(a, 1);
			}else {
				int num = map.get(a);
				num++;
				map.put(a,num);
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
		System.out.println(maxKey);

	}

}

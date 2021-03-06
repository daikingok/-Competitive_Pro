package c_problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C095 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] time = new int[N];

		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			int abs = Math.abs(K-num);
			time[i] = num;
			map.put(num,abs);
		}
		int min = Collections.min(map.values());
		//mapのから値最小値の数をカウント
		int c =0;
		for(int  val : map.values()) {
			if(min == val) {
				c++;
			}
		}
		if(c >= 2) {
			System.out.println(K-min);
			System.out.println(K+min);
		}else {
			for(int  key : map.keySet()) {
				if(K+min == key || K-min == key) {
					System.out.println(key);
				}
			}

		}
	}

}

package abc256;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			list.add(0);
			//0を4個格納
			for(int j=0; j<list.size(); j++) {
				//System.out.println("list.size()= "+list.size());
				int num = list.get(j);
				list.set(j,  num+A[i]);
				//System.out.println("list.get()= "+list.get(j));
			}
		
		}
		for(int i=0; i<N; i++) {
			if(list.get(i) >= 4) {
				count++;
			}
		}
		System.out.println(count);
	}

}

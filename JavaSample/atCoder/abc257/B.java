package abc257;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
	
		//駒動かす対象の取得
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<K; i++) {
			int place = sc.nextInt();
			list.add( place -1);
		}
		
		int[] L = new int[Q];
	   //駒の位置取得
		for(int i=0; i<Q; i++) {
			int place = sc.nextInt();
			L[i]  = place -1;
		}
		
		int[] koma = new int[N];
		//駒あれば1なければ2
		for(int i =0; i<N; i++) {
			if(list.contains(i)) {
				koma[i] = 1;
			}else {
				koma[i] = 0;
			}
		}
		for(int i =0; i< L.length; i++) {
			int place = L[i];
			
			if(place != N-1) {
				System.out.println("place = "+place);
				System.out.println("koma[] = "+koma[place]);
				if(koma[place] != 1) {
					koma[place] = 0;
					koma[place+1] = 1;
				}
			}
		}
//		for(int i=0; i<koma.length; i++) {
//			//System.out.println(koma.length);
//			System.out.println(koma[i]);
//		}
			
		
	}

}

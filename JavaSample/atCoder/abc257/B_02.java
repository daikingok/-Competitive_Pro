package abc257;

import java.util.Arrays;
import java.util.Scanner;

public class B_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		//駒の位置
		Integer[] koma = new Integer[K];
		for(int i=0; i<K; i++) {
			koma[i] = sc.nextInt();
		}
		//命令の対象位置
		int[] order = new int[Q];
		for(int i=0; i<Q; i++) {
			int num = sc.nextInt();
			order[i] = num - 1;
			
//			System.out.println("koma[order[i]] = "+koma[order[i]]);
			if(koma[order[i]] != N &&  !Arrays.asList(koma).contains(koma[order[i]]+1) ) {
				koma[order[i]]++;
//				System.out.println(koma[order[i]]);
			}
		}
		
		for(int i=0; i<K; i++) {
			System.out.print(koma[i]+" ");
		}
		
	}

}

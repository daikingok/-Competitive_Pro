package atCoder_B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N;
		N = sc.nextInt();

		//Integer[] hairetu  = new Integer[100];
//		int[] array = new int[N];
		Integer[] array =  new Integer[N];
		for(int i=0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		
		int alice= 0;
		int bob =0;
		
		//配列降順ソート　降順はIntegerでしか使えない
		Arrays.sort(array, Collections.reverseOrder());
		
		for(int t=0; t<array.length; t++) {
			//System.out.println(array[t]);
			if( t % 2 == 0) {
				alice += array[t];
			}else {
				bob  +=  array[t];
			}
		}

		System.out.println(alice -bob);
	}

}

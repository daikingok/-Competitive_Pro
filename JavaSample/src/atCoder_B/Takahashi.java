package atCoder_B;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Takahashi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int N,K;
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		int[] like = new int[N];
		int[] dislike = new int[K];
		
		for(int i=0; i<N; i++) {
			like[i] = sc.nextInt();
		}
		for(int j=0; j<K; j++) {
			dislike[j] = sc.nextInt();
		}
		
		IntStream  ints = Arrays.stream(like);
		OptionalInt optionalInt = ints.max();
        int maxAsInt = optionalInt.getAsInt();
        //System.out.println(maxAsInt);
		
		boolean flg = false;
		for(int t=0; t<K; t++) {
	        //System.out.println(like[dislike[t]-1] );
			if(like[dislike[t]-1] == maxAsInt) {
				
				flg = true;
			}
		}
		if(flg) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}

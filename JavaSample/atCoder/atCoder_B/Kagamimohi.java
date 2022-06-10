package atCoder_B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Kagamimohi {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer[] mochi = new Integer[N];
		
		for(int i=0; i<N; i++) {
			mochi[i] = sc.nextInt();
		}
		//数値が重複するListを作成
        List<Integer> listWithDuplicates = Arrays.asList(mochi);
        
        //HashSetに数値が重複するListを渡し、重複なしのリストに詰め替える
        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));

		System.out.println(listWithoutDuplicates.size());

	}

}

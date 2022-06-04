package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class library {
	public static void main(String[] args) {
		//多次元配列の作成
		int count = 0;
		int n = 0;

		int[][] array = new int[n][n];
		Scanner sc = new Scanner (System.in);


		for(int i=0; i<count; i++){
			for(int t=0; t<n; t++){
				array[i][t] = sc.nextInt();  
			}
		}

		int[] aaa = new int[n];

		//配列の最大値、最小値
		//	Arrays.stream([aaa]).min().getAsInt();
		//	Arrays.stream([aaa]).max().getAsInt();
		//int sum = Arrays.stream(arr).sum();

		//文字列に特定の文字が含まれているか
		String str = "Character";
		System.out.println(str.contains("h"));
		
		Integer[] array1 = {10, 30, 40, 21, 5};
		Arrays.sort(array); // 昇順
	    System.out.println(Arrays.toString(array1));

	    Arrays.sort(array, Collections.reverseOrder()); // 降順
	    System.out.println(Arrays.toString(array1));
		
	}



}

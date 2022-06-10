package abc245;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mex {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		int[] array  = new int[N];
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			list.add( sc.nextInt()) ;
		}
		//最大値取得
		int max = calcMax(list);
		
		for(int  i=0; i<= max+1; i++) {
			//配列からListに変換
			if(!list.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	//配列内の最大値取得
	private static int calcMax(List<Integer> array) {
		 int intMax = array.get(0);

	        for (int num : array)  {
	            if(intMax < num) {
	                intMax = num;
	            }
	        }
	        return intMax;
	}
}




package atCoder_C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C062 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		String[] array = new String[T]; 
		int count =0;
		for(int j =0; j<T; j++) {
			array[j] = sc.next();
		}
		for(int i=0; i<T; i++) {
//			System.out.println(i);
//			System.out.println(array[i]);
			if(array[i].contains("melon")){
				count = i;
				list.add(i);
				i+=10;
			}
		}
		System.out.println(list.size());
//		if(count == 0) {
//			System.out.println(0);
//		}
	}
}

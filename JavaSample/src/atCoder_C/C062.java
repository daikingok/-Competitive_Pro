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
		for(int i=0; i<15; i++) {
			array[i] = sc.next();
			if(array[i].contains("melon")){
				list.add(i);
				System.out.println(list.get(count));
				count++;
			}
		}
		if(count == 0) {
			System.out.println(0);
		}
	}
}

package paiza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C044 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			String str = sc.next();
			if(!list.contains(str)) {
				list.add(str);
			}
		}
		//2つの手が入っている
		System.out.println(list.size());
		if(list.size() >= 2) {
			if(list.size() == 3) {
				System.out.println("draw");
			}
			//パーとチョキの時
			if(!list.contains("rock")) {
				System.out.println("scissors");

				//チョキとグーの時	
			}else if(!list.contains("paper")) {
				System.out.println("rock");

				//パーとグーの時
			}else if(!list.contains("scissors")) {
				System.out.println("paper");
			}
		}else  {
			System.out.println("draw");
		}
//		if(list.size() == 1) {
//			System.out.println("draw");
//		}

	}

}

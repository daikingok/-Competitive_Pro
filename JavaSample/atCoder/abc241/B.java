package abc241;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer>  list = new ArrayList<>();
		for(int i = 0; i<N; i++) {
			list.add(sc.nextInt());
		}
		String flg = "Yes";
		for(int i=0; i<M; i++) {
			int B = sc.nextInt();
			if(list.contains(B)) {
				//listの値を削除
				list.remove(list.indexOf(B));
			}else {
				flg = "No";
				break;
			}
		}
		System.out.println(flg);
	}

}

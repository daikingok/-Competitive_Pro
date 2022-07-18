package abc220;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long[] array = new Long[N];
		for(int i=0; i<N; i++) {
			array[i] = sc.nextLong();
		}
		Long X = sc.nextLong();
		
		Long ans = 0L;
		int index = 0;
		Long count = 0L;
		while(ans <= X) {
			if(index == N) {
				index = 0;
			}
			ans += array[index];
			index++;
			count++;
			
		}
		System.out.println(count);
	}

}

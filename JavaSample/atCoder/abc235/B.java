package abc235;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		int num = H[0];
		int ans  = 0;
		for(int i=1; i<N; i++) {
//			System.out.println("num = "+num);
//			System.out.println("H[i] = "+H[i]);
			if(num < H[i] ) {
				 ans = H[i];
			}else  if(num >= H[i]){
				 ans = num;
				 break;
			}
				num = H[i];
			
		}
		System.out.println(ans);
		
		

	}

}

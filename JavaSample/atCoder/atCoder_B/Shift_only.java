package atCoder_B;

import java.util.Scanner;

public class Shift_only {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]  a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int count =0;
		//無限ループ　breakで抜け出す
		//ラベル付きループ  break: outerloop　で抜けれる
		 outerloop:
		while(true) {
			for(int j= 0;j<n; j++) {
				if(a[j] % 2 ==0) {
					a[j] = a[j] /2;
				}else{
					break outerloop;
				}
				
			}
			count++;
		}
		
		System.out.println(count);
		
	}

}

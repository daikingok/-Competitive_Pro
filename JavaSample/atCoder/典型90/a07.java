package 典型90;

import java.util.Scanner;

public class a07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//クラスの数
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		//生徒人数
		int Q = sc.nextInt();
		int[] arr2 = new int[Q];
		for(int i=0; i<Q; i++) {
			int num = sc.nextInt();
			int near = getNearAbs(arr, num);
			System.out.println(near);
		}
	}
	public static int getNearAbs(int[] a, int b) {
		//カウント関数
		int num = 0;
		int minv = Math.abs(a[0] -b);
		
		for(int i=1; i<a.length; i++) {
			if(Math.abs(a[i] -b) < minv){
				num = i;
				minv = Math.abs(a[i] - b);
			}
			
		}
		return minv;
		
		
	}

}

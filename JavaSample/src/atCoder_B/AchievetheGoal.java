package atCoder_B;

import java.util.Arrays;
import java.util.Scanner;

public class AchievetheGoal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N, K, M;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		 N =sc.nextInt();
		 K =sc.nextInt();
		 M =sc.nextInt();
		 
		 int[] array = new int[N];
		
		 for(int i=0; i<N-1; i++) {
			 array[i] = sc.nextInt();
		 }
		 sum = Arrays.stream(array).sum();
		 
		 int ans = M*N -sum;
		 
		 //最低点がおより大きいかつ存在している
		 if(ans <=  K && ans >= 0) {
			 System.out.println(ans);
		//必要点数が0より小さいとき（0点で大丈夫）
		 }else if(ans < 0) {
			 System.out.println(0);
		 }
		 //配点MAXでも最低点にトドかないとき
		 else {
			 System.out.println(-1);
		 }
		 
		 
	}

}

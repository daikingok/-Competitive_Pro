package abc247;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
         String ans = "1";
         for(int i=2; i<=n; i++) {
//        	 System.out.println(i );
//        	 System.out.println("ans = "+ ans);
             ans = ans + " " + i + " " + ans;
         }
         System.out.println(ans);

	}

}

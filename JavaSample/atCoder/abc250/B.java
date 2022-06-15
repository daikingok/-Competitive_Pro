package abc250;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A  = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i = 0; i<A*N; i++) {
		 for(int j =0; j< B*N; j++) {
			 if(((i/A%2)^(j/B%2))==1){
					System.out.print("#");
			}
			else{
					System.out.print(".");
			}
		 }
			System.out.println();
		}
	}

}

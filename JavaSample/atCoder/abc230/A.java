package abc230;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N < 42  && N >= 10) {
			System.out.println("AGC0"+N);
		}else if(42<= N && N<98) {
			N++;
			System.out.println("AGC0"+N);
		}else  if(N < 10){
			System.out.println("AGC00"+N);
		}else {
			N++;
			System.out.println("AGC"+N+1);
		}
	}

}

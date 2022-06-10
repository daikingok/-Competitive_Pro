package c_problems;

import java.util.Scanner;

public class C093 {


	public static int sumDigits(int n) {
		int sum = 0;
		//自然数の各桁の和を計算
		while (n != 0) {
			//sumDigitsは単独ではloopしないので、while loopを使う。
			sum += n % 10;
			//再右端の桁を得るために%10を利用する。
			n /= 10;
			//再右端の桁を取り除くためにn/=10を利用する。
		}
		return sum;//合計を返す
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int alice = sc.nextInt();
		int bob = sc.nextInt();

		int alice_sum = sumDigits(alice);
		int bob_sum = sumDigits(bob);

		if(alice_sum == bob_sum) {
			System.out.println("Draw");
		}else if(alice_sum > bob_sum) {
			System.out.println("Alice");
		}else if(alice_sum < bob_sum) {
			System.out.println("Bob");
		}
	}

}

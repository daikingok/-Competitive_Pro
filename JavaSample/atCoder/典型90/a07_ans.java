package 典型90;

import java.util.Arrays;
import java.util.Scanner;

public class a07_ans {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] aArray = new int[N];
		for (int i = 0; i < N; i++) {
			aArray[i] = scanner.nextInt();
		}

		Arrays.sort(aArray);

		int Q = scanner.nextInt();
		for (int i = 0; i < Q; i++) {
			int b = scanner.nextInt();

			int left = 0;
			int right = N;
			while (right - left > 1) {
				int mid = left + (int)((right - left) / 2);
				if (b >= aArray[mid]) {
					left = mid;
				} else {
					right = mid;
				}
			}

			if (right == N) {
				System.out.println(Math.abs(b - aArray[N-1]));
			} else {
				System.out.println(Math.min(Math.abs(b - aArray[left]), Math.abs(b - aArray[right])));
			}
		}
	}

}

package abc261;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int L1 = sc.nextInt();
		int R1 = sc.nextInt();
		int L2 = sc.nextInt();
		int R2 = sc.nextInt();
		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		for(int i=L1; i<=R1; i++) {
			num1.add(i);
		}
		for(int i=L2; i<=R2; i++) {
			num2.add(i);
		}
		int ind = 0;
		for(int ans : num1) {
			if(num2.contains(ans)) {
				ind++;
			}
		}
		if(ind == 0) {
			System.out.println(ind);
		}else {
			System.out.println(ind-1);
		}
		
		

	}

}

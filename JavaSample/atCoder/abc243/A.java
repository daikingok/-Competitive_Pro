package abc243;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
	
		int index = 0;
		int F = V -A;
		String ans = "";
		while(V >= 0) {
			if(index == 0) {
				V -= A;
				ans = "F";
				index++;
			}else if(index == 1) {
				V -= B;
				ans = "M";
				index++;
			}else if(index == 2) {
				V -= C;
				index = 0;
				ans = "T";
			}
		}
		System.out.println(ans);
	}

}

package abc222;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		int zero = 4-len;
		
		for(int i=0; i<zero; i++) {
			s = "0"+s;
		}
		System.out.println(s);
	}

}

package abc240;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(Math.abs(a-b) == 1 || Math.abs(a-b) == 9) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

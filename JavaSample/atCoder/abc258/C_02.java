package abc258;

import java.util.Scanner;

public class C_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		   final Scanner scanner = new Scanner(System.in);
		   
		    final int N = scanner.nextInt(); // length of S
		    final int Q = scanner.nextInt();
		    String S = scanner.next();
		    char[] chars = S.toCharArray();
		    int startIndex = 0;
		 
		    for (int i = 0; i < Q; i++) {
		      int t = scanner.nextInt();
		      int x = scanner.nextInt();
		 
		      switch (t) {
		        case 1:
//		        	System.out.println("case:1 ");
//			          System.out.println("startIndex = "+ startIndex);
//			          System.out.println("N = "+ N);
//			          System.out.println("x = "+ x);
//			          System.out.println("(startIndex + N - x) % N = "+ (startIndex + N - x) % N);
		          startIndex = (startIndex + N - x) % N;
		         		          break;
		 
		        case 2:
		          int index = (startIndex + x - 1) % N;
//		          System.out.println("case:2 ");
//		          System.out.println("startIndex + x - 1 = "+( startIndex + x - 1));
//		          System.out.println("N = "+ N);
//		          System.out.println("(startIndex + x - 1) % N = "+ (startIndex + x - 1) % N);
		          System.out.println(chars[index]);
		          break;
		      }
		    }
	}

}

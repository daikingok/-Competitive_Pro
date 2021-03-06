package abc247;

import java.util.Scanner;

public class Unipe_nickname {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	       Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	 
	        //標準入力
	        String[] s = new String[N];
	        String[] t = new String[N];
	 
	        //複数のintの入力(格納数は決まっている)
	        for (int i = 0; i < N; i++) {
	            s[i] = scanner.next();
	            t[i] = scanner.next();
	        }
	        String[] nicknames = new String[N];
	        
	        for (int i = 0; i < N; i++) {
	            boolean uniqueFirst = true;
	            boolean uniqueFamily = true;
	            for (int j = 0; j < N; j++) {
	                if (i == j) {
	                    continue;
	                }
	                if (s[i].equals(s[j])) {
	                    uniqueFirst = false;
	                }
	                if (t[i].equals(t[j])) {
	                    uniqueFamily = false;
	                }
	                if (s[i].equals(t[j])) {
	                    uniqueFirst = false;
	                    uniqueFamily = false;
	                }
	            }
	            if(uniqueFirst) {
	                nicknames[i] = s[i];
	            }
	            if(uniqueFamily) {
	                nicknames[i] = t[i];
	            }
	            if(!uniqueFirst && !uniqueFamily) {
	                System.out.println("No");
	                System.exit(0);
	            }
	        }
	        System.out.println("Yes");
	}

}

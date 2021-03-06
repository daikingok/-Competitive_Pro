package abc261;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char matrix[][] = new char[n][n];
		for(int i=0;i<n;i++){
			matrix[i] = sc.next().toCharArray();
		}
		boolean ans = true;
		for(int i=0;i<n-1 && ans;i++){
			for(int j=i+1;j<n && ans ;j++){
				ans = check(matrix[i][j],matrix[j][i]);
			}
		}
		if(ans){
			System.out.println("correct");
		}
		else{
			System.out.println("incorrect");
		}
	}
	public static boolean check(char a,char b){
		if(a=='D' || b=='D'){
			return a==b;
		}
		if(a=='L')
			return b=='W';
		return b=='L';
	}

}

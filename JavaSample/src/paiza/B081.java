package paiza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B081 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, String> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		int H  = sc.nextInt();
		int W  = sc.nextInt();
		
		int[][] num;
		
		String[][] array = new String[H][W];
		
		for(int i=0; i<H;i++) {
			for(int j=0; j<W; j++ ) {
				String str =  sc.next();
				String[] strs = str.split("");
				System.out.println(strs);
				//array[i][j] = split;
				
//				if(array[i][j].contains("#")) {
//					System.out.println(i+" : "+ j);
//				}
			}
		}
	}

}

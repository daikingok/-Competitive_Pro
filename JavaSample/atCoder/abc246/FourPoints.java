package abc246;

import java.util.Scanner;

public class FourPoints {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][2];
		int x = 0;
		int y =0;
		for(int i=0; i<3; i++) {
			for(int t=0; t<2; t++) {
				array[i][t] = sc.nextInt();
			}
		}
		if(array[0][0] == array[1][0]) {
			x = array[2][0];
		}else if(array[0][0] == array[2][0]) {
			x = array[1][0];
		}else if(array[1][0] == array[2][0]){
			x = array[0][0];
		}
		if(array[0][1] == array[1][1]) {
			y = array[2][1];
		}else if(array[0][1] == array[2][1]) {
			y = array[1][1];
		}else if(array[1][1] == array[2][1]) {
			y = array[0][1];
		}
		System.out.println(x+" "+y);
	}

}

package abc234;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//座標
		double[][] p = new double[N][2];
		List<Double>list = new ArrayList<Double>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				p[i][j] = sc.nextDouble();
			}
		}
		//線分の各パターンを取得
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				list.add(dist(p[i][0], p[i][1], p[j][0], p[j][1]));
				//System.out.println("i = "+i+" p = "+j);
			}
		}
		System.out.println(calcMax(list));
		
		
	}
	private static double dist( double x1, double y1, double x2, double y2 ) {
		double l;
		double dx,dy;
		dx = x2 - x1;
		dy = y2 - y1;
		l = Math.sqrt( dx * dx + dy * dy );
		return l;
	}
	public static double calcMax(List<Double> array) {

		double Max = array.get(0);

        for (int i = 1; i <array.size(); i++ ) {
            if(Max < array.get(i)) {
            	Max = array.get(i);
            }
        }
        return Max;
    }
//    public static int calcMin(int[] array) {
//
//        int intMin = array[0];
//
//        for (int i = 1; i < array.length; i++ ) {
//            if(intMin > array[i]) {
//                intMin = array[i];
//            }
//        }
//        return intMin;
//    }
}

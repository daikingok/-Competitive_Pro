package b_problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B103 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Red = sc.nextInt();
		int Green = sc.nextInt();
		int Blue = sc.nextInt();
		Map<String, String> map = new HashMap<>();
		boolean flg = false;
		for(int i =0; i<N; i++) {
			String  place = sc.next();
			String  Color = sc.next();
			if(place.equals("R")) {
				if(Color.equals("R")) {
					Red++;
				}else if(Color.equals("G")){
					Green++;
				}else if(Color.equals("B")){
					Blue++;
				}else if(Color.equals("Y")){
					Red++;
					Green++;
				}else if(Color.equals("M")){
					Red++;
					Blue++;
				}else if(Color.equals("C")){
					Green++;
					Blue++;
				}else if(Color.equals("W")){
					Red++;
					Green++;
					Blue++;
				}
			}else {
				if(Color.equals("R")) {
					Red--;
				}else if(Color.equals("G")){
					Green--;
				}else if(Color.equals("B")){
					Blue--;
				}else if(Color.equals("Y")){
					Red--;
					Green--;
				}else if(Color.equals("M")){
					Red--;
					Blue--;
				}else if(Color.equals("C")){
					Green--;
					Blue--;
				}else if(Color.equals("W")){
					Red--;
					Green--;
					Blue--;
				}
			}
			if(Red == Green && Red == Blue && Green == Blue) {
				flg = true; 
				break;
			}else {
				
			}
		}
		if(flg) {
			System.out.println(Red);
		}else {
			System.out.println("no");
		}
	}
}

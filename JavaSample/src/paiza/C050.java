package paiza;

import java.util.Scanner;

public class C050 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean flg = false;
		String win="";
		int count =1;
		while(!flg) {
			if(count % 2 != 0 ) {
				flg = A_pro(S, a,b);
					S+= 10;
				win = "A";
			}else {
				flg = B_pro(S,a,b);
					S+= 1000;
				 win = "B";
			}
			count++;
		}
		System.out.println(win+" "+S);
		

	}
	//a: 商品金額　b：Aさんの予算　c:Bさんの予算
	static boolean A_pro(int a, int b, int c) {
		//Aさんの入札額
		int num = a + 10;
		//入札額がAさんの予算よリ少ないかつBさんの予算より多いなら
		if(num <= b && num+1000 >= c ) {
			return true;
		}else {
			return false;
		}
	}
	//a: 商品金額　b：Aさんの予算　c:Bさんの予算
	static boolean B_pro(int a, int b, int c){
		int num = a + 1000;
		//入札額がBさんの予算より少ないかつ、Asannno 
		if(num <= c && num+10 >= b) {
			return true;
		}else {
			return false;
		}
	}

}

package atCoder_B;

import java.util.Scanner;

public class B_Distance_between {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H= sc.nextInt();
		int W = sc.nextInt();
		int[] Yjiku  = new int[2];
		int[] Xjiku = new int[2];
		int count =0;

		String[] strs = new String[H];
		for(int t=0; t<H; t++) {
			strs[t] = sc.next();
			if(strs[t].indexOf("o") != -1) {
				Yjiku[count] = t;
				Xjiku[count] = strs[t].indexOf("o");
				count++;
			}
		}

		if(count ==1) {
			int[] place =new int[5];
			int n=0;
			String[] same = strs[Yjiku[0]].split("");
			for(int i=0; i<same.length; i++) {
				if(same[i].equals("o")) {
					place[n] = i;
					n++;	
				}
			}
			System.out.println(place[1] - place[0]);
		}else {
			int ans = Math.abs( Yjiku[1] - Yjiku[0])  + Math.abs(Xjiku[1] - Xjiku[0]);
			System.out.println(ans);
		}


	}

}

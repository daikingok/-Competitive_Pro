package c_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C019 {

		//引数numの約数を求めて配列に入れるメソッド
	    public static List<Integer> divisor(int num){
	        List<Integer> listBox = new ArrayList<>();

	        for (int i = 1; i <= (num / 2); i++){
	            if (num % i == 0){
	                listBox.add(i);
	            }
	        }
	        listBox.add(num);
	        return listBox;
	    }

	    public static void main(String[] args) throws Exception {
	        //標準入力された数値の約数を出力
	        Scanner scan = new Scanner(System.in);
	        int Q = scan.nextInt();
	        int[] get = new int[Q];
	        for(int j =0; j<Q; j++) {
	        	get[j] = scan.nextInt();
	        }
	        for(int i = 0; i<get.length; i++) {
	        	 int sum = 0;
	        	int n =  get[i];
		        List<Integer> array = divisor(n);
		        
		        
		        for (int t = 0; t< array.size(); t++) {
		        	
		            sum+=  array.get(t);
		        }
		        int abs = Math.abs(n -(sum-n));
		        if(abs == 0) {
		        	System.out.println("perfect");
		        }else if(abs == 1){
		        	System.out.println("nearly");
		        }else {
		        	System.out.println("neither");
		        }
	        }
	        
	}

}

package abc254;

import java.util.Arrays;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		int[]  sort = new int[N];
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			a[i] = num;
			sort[i] = num;
			
		}
		
	     Arrays.sort(sort);
	     
	     boolean flg= false;
	     int num =0;
	     for(int i=0; i<K; i++) {
	    	 if(a .equals(sort) ) {
	    		 flg =true;
	    		
	    	 }else {
	    		 int index = a[num];
	    		 a[num] = a[num+K];
	    		 a[num + K] = index;
//	    		 System.out.println(num);
//	    		 System.out.println(num + K);
	    		 num++;
	    	 }
	     }
	     if(flg) {
	    	 System.out.println("Yes");
	     }else {
	    	 System.out.println("No");
	     }
	     
	}
//	 static <t> void swap(List<t> list,int index1,int index2){
//		 
//	      T tmp=list.get(index1);
//	 
//	      list.set(index1,list.get(index2));
//	 
//	      list.set(index2, tmp);
//	 
//	  }

}

package 典型90;

import java.util.Scanner;

public class a04 {

	public static void main(String[] args) {
		 var sc = new Scanner(System.in);
		    var H = sc.nextInt();
		    var W = sc.nextInt();
		 
		    var masu = new int[H][W];
		    var rowSum = new int[H];
		    var colSum = new int[W];
		    for (var i = 0; i < H; i++) {
		      for (var j = 0; j < W; j++) {
		        masu[i][j] = sc.nextInt();
		        rowSum[i] += masu[i][j];
		        colSum[j] += masu[i][j];
		      }
		    }
		 
		    for (var i = 0; i < H; i++) {
		      var sb = new StringBuilder();
		      for (var j = 0; j < W; j++) {
		        var result = rowSum[i] + colSum[j] - masu[i][j];
		        sb.append(result + " ");
		      }
		      System.out.println(sb.toString());
		    }
	}

}

import java.util.Scanner;

public class C071 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int count =0;
		for(int i=1; i<M; i++) {
			for(int t=1; t<N; t++) {
				double naname =Math.sqrt( i*i + t*t);
				if(i % 3==0 && t %4==0 && i < t && naname % 5==0) {
					//System.out.println("i : "+i+"  j  :"+t+"  h: "+naname );
					count++;
				}else if(i % 4==0 && t %3==0 && i > t && naname % 5==0) {
					//System.out.println("i : "+i+"  j  :"+t+"  h: "+naname );
					count++;
				}else if(i % 8==0 && t %15==0&& i < t && naname % 17==0){
					//System.out.println("i : "+i+"  j  :"+t+"  h: "+naname );
					count++;
				}else if(i % 15==0 && t %8==0 && i > t && naname % 17==0)  {
					count++;
					//System.out.println("i : "+i+"  j  :"+t+"  h: "+naname );
				}else if(i % 5==0 && t %12==0 && i < t && naname % 13==0){
					count++;
					//System.out.println("i : "+i+"  j  :"+t+"  h: "+naname );
				}else if(i % 12==0 && t %5==0 && i > t  && naname % 13==0) {
					count++;
					//System.out.println("i : "+i+"  j  :"+t+"  h: "+naname );
				}
			}
		}
		//System.out.println("i : "+i+"j  :"+t);
		System.out.println(count);
	}

}

import java.util.Scanner;

public class C074 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int X = sc.nextInt();
		String[] array = new String[H];
		for(int i=0; i<H; i++) {
			array[i] = sc.next();
			//System.out.println(array[i]);
		}
		String str = String.join("", array);
		//System.out.println(str);

		String[] split_str = new String[str.length()];
		split_str = str.split("");
		int count=0;
		for(int t=0; t<split_str.length; t++) {
				System.out.print(split_str[t]);
				count++;
				
				if(count % X==0) {
					System.out.println("");
				}
		}
	}

}

package paiza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C085 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		char c = 'a';
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < 26; i++){
		    int strong = sc.nextInt();
		    map.put(c, strong);
		   // System.out.println(map.get(c));
		    c++;
		}
		
		
		String str = sc.next();
		char[] chr = str.toCharArray();
		
		for(int i=0; i<chr.length; i++) {
			
			int limit = map.get(chr[i]);
			
			if(limit == 0) {
				
			}else {
				System.out.print(chr[i]);
				map.replace(chr[i], limit-1);
				
			}
		}
		
	}

}

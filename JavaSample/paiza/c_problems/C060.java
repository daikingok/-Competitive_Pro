package c_problems;

import java.util.Arrays;
import java.util.Scanner;

public class C060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();
		
		String[] array = new String[N];
		for(int i=0; i<N; i++) {
			array[i] = sc.next();
		}
		Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);//case insensitive sort
        int pages = K * (P-1);
        for(int i = pages; i< pages + K;  i++) {
        	if(i  ==  N ) {
        		break;
        	}else {
        		System.out.println(array[i]);
        	}
        }
		
		
		
		
		
		
//		//文字と文字を数字化したものを格納するmap
//		Map<String, Long> map = new HashMap<>();
//		
//		int[] char_to_int = new int[N];
//		for(int i = 0; i< N; i++ ) {
//			array[i]  = sc.next();
//			//char型の配列に格納
//			char[] ch = array[i].toCharArray();
//			//一文字ごとの処理
//			//charをint変換した文字列を入れる配列
//			String[] box = new String[ch.length];
//			for(int j = 0; j<ch.length; j++)
//			{
//				 char_to_int[j] = ch[j];
//				 //System.out.println(char_to_int[j] );
//				 Integer num = Integer.valueOf( char_to_int[j]);
//				 box[j]  = num.toString();				
//			}
//			//System.out.println(String.join("", box));
//			String num_array = String.join("", box);
//			map.put(array[i], 	Long.parseLong(num_array));
//		}
//		List<Entry<String, Long>> list = new ArrayList<>(map.entrySet());
//		list.sort(Entry.comparingByValue());
//		list.forEach(System.out::println);
//		
//    
//	}
	}
}

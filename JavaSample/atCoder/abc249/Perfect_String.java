package abc249;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Perfect_String {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		String S = sc.next();
		String[] SS = S.split("");
		//重複削除(文字列の十番を変更しない)
		  List<String> SS_List = new ArrayList<String>(Arrays.asList(SS));
	      List<String> onlyS = new ArrayList<String>(new LinkedHashSet<>(SS_List));
	      
	      boolean largeFlg = false;
	     boolean smallFlg = false;
	      if(SS_List.size() == onlyS.size()){
	    	 for(int i =0; i<onlyS.size(); i++) {
	    		 if(isAlphabetLarge(onlyS.get(i))) {
	    			 largeFlg = true;
	    		 }
	    		 if(isAlphabetLowercase(onlyS.get(i))) {
	    			 smallFlg = true;
	    		 }
	    	 }
	    	 if(largeFlg && smallFlg) {
	    		 System.out.println("Yes");
	    	 }else {
	    		 System.out.println("No");
	    	 }
	      }else {
	    	  System.out.println("No");
	      }
	}
	/**
	 * 英字チェック（大文字）
	 * @param value 検証対象の値
	 * @return 結果（true：英字、false：英字ではない）
	 */
	public static boolean isAlphabetLarge(String value) {
	    boolean result = false;
	    if (value != null) {
	        Pattern pattern = Pattern.compile("^[A-Z]+$");
	        result = pattern.matcher(value).matches();
	    }
	    return result;
	}
	/**
	 * 英字チェック（小文字）
	 * @param value 検証対象の値
	 * @return 結果（true：英字、false：英字ではない）
	 */
	public static boolean isAlphabetLowercase(String value) {
	    boolean result = false;
	    if (value != null) {
	        Pattern pattern = Pattern.compile("^[a-z]+$");
	        result = pattern.matcher(value).matches();
	    }
	    return result;
	}

}

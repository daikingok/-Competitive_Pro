package abc232;

import java.util.Scanner;
public class B{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    String t=in.next();
    String ans="Yes";
    int k=(t.charAt(0)-s.charAt(0)+26)%26;
    //System.out.println("k= "+k);
    int n=s.length();
    for(int i=1; i<n; i++)
    {
      int tmp=(t.charAt(i)-s.charAt(i)+26)%26;
      //System.out.println("tmp= "+tmp);
      if(tmp!=k){
        ans="No";
        break;
      }
    }
    System.out.println(ans);
  }
}
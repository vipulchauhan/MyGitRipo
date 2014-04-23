/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 367940
 */
import stringnum.StringNum;
public class TestNum {
 public static void main(String args[])  {
    String s1= "161.58";
    String s2 = "2272.56";
            String s3=StringNum.addNumericString(s1,s2);
     System.out.printf("%15s",s1);
     System.out.printf("\n%15s",s2);
     System.out.printf("\n--------------------- ");
     System.out.printf("\n%15s",s3);
     
 }
}

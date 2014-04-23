/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringnum;

/**
 *
 * @author 367940
 */
public class StringNum {

    public static String addNumericString(String no1, String no2) {
        String ans = "";
        int i1, i2, d1, d2, cr, s;
        char c = '0';
        boolean dec = false;
        cr = 0;
        String no1dec = "";
        String no2dec = "";
        if (no1.contains(".")) {
            dec = true;
            int d = no1.indexOf('.');
            no1dec = no1.substring(d+1);
            no1 = no1.substring(0, d);
        }
        if (no2.contains(".")) {
            dec = true;
            int d = no2.indexOf('.');
            no2dec = no2.substring(d+1);
            no2 = no2.substring(0, d);
        }
         StringBuffer afterdec = null;
         
         char cr1 = '0';
        if (dec) {
            int declen = Math.max(no1dec.length(), no2dec.length());
            afterdec = afterdec(no1dec, no2dec);
            
            if (afterdec.length() > declen) {
                cr1 = afterdec.charAt(0);
                afterdec.delete(0, 1);
            }
        }else{
            afterdec = new StringBuffer();
            afterdec.append("0");
        }
        
        ans = beforedec(no1, no2, cr1).toString() + "." + afterdec.toString();
        return ans;

    }

    private static StringBuffer beforedec(String no1, String no2, char cr1) {
        StringBuffer ans = new StringBuffer();
        int i1, i2, d1, d2, cr, s;
        char c = '0';
        cr = cr1 - c;
        //System.out.println(no1 + " " + no2);

        for (i1 = no1.length() - 1, i2 = no2.length() - 1; i1 >= 0 || i2 >= 0 || cr > 0; i1--, i2--) {

            if (i1 < 0) {
                d1 = 0;
            } else {

                d1 = no1.charAt(i1) - c;
            }
            if (i2 < 0) {
                d2 = 0;
            } else {
                d2 = no2.charAt(i2) - c;
            }

            s = d1 + d2 + cr;
            if (s > 9) {
                cr = s / 10;
                s = s % 10;


            } else {
                cr = 0;
            }
            //   System.out.println(d1 + " + " + d2 + " = " + s + " , " + cr);
            ans.append(String.valueOf(s));
        }

        return ans.reverse();
    }

    private static StringBuffer afterdec(String no1, String no2) {
        StringBuffer ans = new StringBuffer();
        int i1, i2, d1, d2, cr, s;
        char c = '0';
        cr = 0;
        //System.out.println(no1 + " " + no2);
        int l1 = no1.length();
        int l2 = no2.length();
        if (l1 > l2) {
            StringBuffer spaces = new StringBuffer();
            for (int i = 0; i < (l1 - l2); i++) {
                spaces.append("0");
            }
            no2 += spaces.toString();
        }
        if (l1 < l2) {
            StringBuffer spaces = new StringBuffer();
            for (int i = 0; i < (l2 - l1); i++) {
                spaces.append("0");
            }
            no1 += spaces.toString();
        }
        //System.out.println(no1 + " " + no2);
        for (i1 = l1-1, i2 = l2-1; i1 >= 0 || i2 >= 0 || cr > 0; i1--, i2--) {

            if (i1 < 0) {
                d1 = 0;
            } else {

                d1 = no1.charAt(i1) - c;
            }
            if (i2 < 0) {
                d2 = 0;
            } else {
                d2 = no2.charAt(i2) - c;
            }

            s = d1 + d2 + cr;
            if (s > 9) {
                cr = s / 10;
                s = s % 10;


            } else {
                cr = 0;
            }
            //   System.out.println(d1 + " + " + d2 + " = " + s + " , " + cr);
            ans.append(String.valueOf(s));
        }

        return ans.reverse();
    }
}

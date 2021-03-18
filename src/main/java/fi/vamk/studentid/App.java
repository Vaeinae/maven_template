package fi.vamk.studentid;

import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("1 divided by 0 is " + divide(1,0));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    /**
    * Function get two doubles as arguments and return the 
    * division of them in two decimals. If denominator is zero return NaN.
    */

    public static double divide (double a, double b) {
        DecimalFormat df = new DecimalFormat("#.##");
        if (b == 0){
            return Double.NaN;
        } else {
            return Double.valueOf(df.format(a/b).replace(",",".")).doubleValue();
        }
    }

    public static String returnTwoChars(String input){
        if (input != null){
            if(input.length() < 2){
                return input;
            } else {
                return input.substring(0, 2);
            }
        } else{
        return null;
        }
    }

    public static Double div(Double a, Double b) {
        if(a != null && b != null && b != 0) {
            return a/b;
        } else {
            return null;
        }
    }
}

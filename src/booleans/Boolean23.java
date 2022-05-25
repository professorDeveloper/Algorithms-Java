package booleans;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int g,a,b;
        boolean is;
        System.out.print ("G:");
        g=scanner.nextInt ();//
        a=g/100;//3
        b=g%10;//3
        is=a==b && g>=100 && g<=999;
        System.out.println (is);

    }
}

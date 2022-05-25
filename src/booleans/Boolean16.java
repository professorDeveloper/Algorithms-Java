package booleans;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a;
        boolean d;
        System.out.print ("a:");
        a=scanner.nextInt ();
        d=a%2==0 && a>9 && a<100;
        System.out.println (d);
    }
}

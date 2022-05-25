package booleans;

import java.util.Scanner;

public class Boolean27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int x,y;
        boolean b;
        System.out.print ("x:");
        x=scanner.nextInt ();
        System.out.print ("y:");
        y=scanner.nextInt ();
        b=x<0;
        System.out.println (b);
    }
}

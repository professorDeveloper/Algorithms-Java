package booleans;

import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a;
        boolean b;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        b=a%2==0;

        System.out.println (b);
    }
}

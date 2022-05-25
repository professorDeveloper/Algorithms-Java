package booleans;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b;
        boolean c;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        System.out.print ("B:" ); //Asd
        b=scanner.nextInt ();
        c=a>2 && b<=3;//a starting va b starting 3

        System.out.println (c);
    }
}


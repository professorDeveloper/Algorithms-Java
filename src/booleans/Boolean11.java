package booleans;

import java.util.Scanner;

public class Boolean11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c,d;
        boolean x;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        System.out.print ("B:" ); //Asd
        b=scanner.nextInt ();
        c=a%2;//1
        d=b%2;//0
        x=d+c==0 || d+c==2 ;//

        System.out.println (x);
    }
}

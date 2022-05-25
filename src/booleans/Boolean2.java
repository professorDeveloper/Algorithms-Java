package booleans;

import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a;//7
        boolean b;
        System.out.print ("A:" ); //Asd
        a=scanner.nextInt ();
        b=a%2==1;//1

        System.out.println (b);
    }
}

package booleans;

import java.util.Scanner;

public class Boolean15 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a,b,c;
            boolean d;
            System.out.print("A = ");
            a=scanner.nextInt();
            System.out.print("B = ");
            b=scanner.nextInt();
            System.out.print("C = ");
            c=scanner.nextInt();
            d =(a>=0 && b>=0 && c<0)||(a<0 && b>=0 && c>=0)||(a>=0 && b<0 && c>=0);
            // (-)||(-)||(-)
            System.out.println(d);
    }
}

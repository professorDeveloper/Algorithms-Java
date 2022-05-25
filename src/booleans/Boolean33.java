package booleans;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int a,b,c;
        boolean d;
        System.out.print("A = ");// 19
        a=scanner.nextInt();
        System.out.print("B = ");//5
        b=scanner.nextInt();
        System.out.print("C = ");// 19
        c=scanner.nextInt();
        d=((a+b)>c && (a-b)<c);
        System.out.println (d);
    }
}

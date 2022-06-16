package imtihon;

import java.util.Scanner;

public class imtihon2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
    int a,b,c;
    boolean d;
        System.out.print("A = ");// 19,3
                a=scanner.nextInt();
                System.out.print("B = ");//5,4
                b=scanner.nextInt();
                System.out.print("C = ");// 19,5
                c=scanner.nextInt();
                d=((a + b) > c && (a + c) > b && (b + c) > a);
                System.out.println (d);//true

    }
}

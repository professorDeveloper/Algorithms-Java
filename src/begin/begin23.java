package begin;

import java.util.Scanner;

public class begin23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a, b ,c;

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        int d= c;

        c=b;
        b=a;
        a=d;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}

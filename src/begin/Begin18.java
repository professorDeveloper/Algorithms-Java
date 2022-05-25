package begin;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a;
        int b;
        int c;
        int p;
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        System.out.print("c=");
        c = scanner.nextInt();
         p= (c-a)*(c-b);
        System.out.println("Kopaytmasi:"+p);
    }
}

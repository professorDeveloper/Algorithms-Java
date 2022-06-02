package fori;

import java.util.Scanner;

public class for29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        float a;
        System.out.print("A:");
        a = scanner.nextFloat();

        float b;
        System.out.print("B:");
        b = scanner.nextFloat();

        float h = (b - a) / n;
        System.out.print(h);

       ;
        for ( int i = 0; i <= n; ++i)
        {
            System.out.print(a + i * h);
            System.out.print(", ");
        }

    }
}

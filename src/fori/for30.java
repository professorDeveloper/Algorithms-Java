package fori;

import java.util.Scanner;

public class for30 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

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
        System.out.print(" ");

        for ( int i= 0; i <= n; ++i)
        {
            System.out.println(1 - Math.sin(a + i * h)+",");
        }

    }
}

package fori;

import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        int c = 1;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("b:");
        b = scanner.nextInt();

        for (int i = a; i <= b; i++)
        {
            c *= i;
        }
        System.out.print(c);

    }
}

package fori;

import java.util.Scanner;

public class for32 {
    public static void main(String[] args) {
        int n;

        System.out.print("N:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        float ai = 1F;
        System.out.print(ai);
        System.out.print(" ");
        int i;
        for (i = 1; i <= n; ++i) {
            System.out.print(i);
            System.out.print(" ");
            System.out.print((ai + 1) / i);
            System.out.print(" ");
            ai = (ai + 1) / i;
        }

    }
}

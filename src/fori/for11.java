package fori;

import java.util.Scanner;

public class for11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();

        double result = 0;
        for (int i = 0; i <= n; i++)
            result += Math.pow(n + i, 2);
        System.out.print("Natija=" + result);

    }
}

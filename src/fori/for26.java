package fori;

import java.util.Scanner;

public class for26 {
    public static void main(String[] args) {
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("X:");
        x = scanner.nextFloat();

        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        float qiymat = x;
        float sum = x;
        int k = 1;
        for (int i = 2; i <= n; i++) {
            k += 2;
            qiymat *= -1 * x * x;
            sum += qiymat / k;
        }
        System.out.print(sum);

    }
}

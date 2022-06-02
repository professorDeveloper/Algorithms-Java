package fori;

import java.util.Scanner;

public class for25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float x;
        System.out.print("X:");
        x = scanner.nextInt();

        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        float result = x;
        float sum = x;

        for (int i = 2; i <= n; ++i)
        {
            result *= -1 * x;
            sum += result / i;
        }
        System.out.print(sum);

    }
}

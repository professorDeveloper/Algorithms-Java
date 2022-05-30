package fori;

import java.util.Scanner;

public class for10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n=");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += 1 / (double)i;
        System.out.print("Sum=" + sum);


    }
}

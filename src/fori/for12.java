package fori;

import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p = 1;
        System.out.print("N=");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            p = p * (1 + 0.1 * i);
        }
        System.out.println("Natija=" + p);

    }
}

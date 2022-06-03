package fori;

import java.util.Scanner;

public class for31 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sonni kiriting ");
        n = scanner.nextInt();
        double a = 2;
        for (int i = 1; i <= n; ++i)
        {
            a = 2 + 1 / a;
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.print("\n");

    }
}

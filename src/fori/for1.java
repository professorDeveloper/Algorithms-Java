package fori;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        int k;
        int n;

        Scanner scanner=new Scanner(System.in);

        System.out.print("K:");
        k = scanner.nextInt();

        System.out.print("N:");
        n = scanner.nextInt();

        int i;
        for (i = 0; i < n; ++i)
        {
            System.out.print(k);
            System.out.print("\n");
        }
    }

}

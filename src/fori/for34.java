package fori;

import java.util.Scanner;

public class for34 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        float a1 = 1F;
        float a2 = 2F;
        System.out.print(a1);
        System.out.print(" ");
        System.out.print(a2);
        System.out.print(" ");


        float ak;
        for (int i = 3; i <= n; ++i)
        {
            ak = (a1 + 2 * a2) / 3;
            System.out.print(i);
            System.out.print(" ");
            System.out.print(ak);
            System.out.print(" ");
            a1 = a2;
            a2 = ak;
        }

    }
}

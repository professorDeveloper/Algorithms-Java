package fori;

import java.util.Scanner;

public class for40 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner=new Scanner(System.in);

        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();

        int i;
        int i2;
        for (i = 1; i <= b - a + 1; ++i)
        {
            for (i2 = 1; i2 <= i; ++i2)
            {
                System.out.print(a + i - 1);
                System.out.print(" ");
            }
        }

    }
}

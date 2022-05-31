package fori;

import java.util.Scanner;

public class for39 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        int b;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();

        //
        for (int i = a; i <= b; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.println(i);
            }
        }

    }
}

package fori;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a;
        int b;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();
        for (int i = b - 1; i > a; --i)
        {
            System.out.println(i);
        }
        System.out.println("Chiqarilgan Sonlar soni: "+(b - a - 1));

    }
}

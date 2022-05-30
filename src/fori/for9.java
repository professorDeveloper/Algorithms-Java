package fori;

import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("a:");
        a = scanner.nextInt();
        System.out.print("b:");
        b = scanner.nextInt();


        int rez = 0;
        for ( int i = a; i <= b; ++i)
        {
            rez += i * i;
        }
        System.out.print("Natija: ");
        System.out.print(rez);

    }
}

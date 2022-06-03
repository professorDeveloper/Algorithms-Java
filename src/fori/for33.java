package fori;

import java.util.Scanner;

public class for33 {
    public static void main(String[] args) {
        int n;
        int a1 = 1;
        int a2 = 1;
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.print(" n: ");
        n = scanner.nextInt();
        System.out.print("");
        System.out.print(a1);
        System.out.print(" ");
        System.out.print(a2);
        System.out.print(" ");
	 for (int i = 3; i <= n; ++i)
        {
	 a = a1 + a2;
	 a1 = a2;
	 a2 = a;
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.print("\n");

    }
}

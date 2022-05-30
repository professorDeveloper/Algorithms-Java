package fori;

import java.util.Scanner;

import static java.lang.System.in;

public class for15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        float a;
        System.out.print("Raqam:");
        a = scanner.nextFloat();

        int n;
        System.out.print("Daraja:");
        n = scanner.nextInt();


        float rez = 1F;

        for (int i = 1; i <= n; ++i)
        {
            rez *= a;
        }
        System.out.printf("%.1f ning %d-darajasi:%.1f",a,n,rez);
    }
}

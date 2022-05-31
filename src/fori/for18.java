package fori;

import java.util.Scanner;

public class for18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float a;
        System.out.print("A:");
        a = scanner.nextFloat();

        int n;
        System.out.print("N:");
        n = scanner.nextInt();


        float counter = 1F;
        float result = 1F;


        for (int i = 2; i <= n; ++i)
        {
            counter *= -a;
            result += counter;
        }
//
    System.out.println("Natija"+result);

    }
}

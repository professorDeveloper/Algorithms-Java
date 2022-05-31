package fori;

import java.util.Scanner;

public class for22 {
    public static void main(String[] args) {
        float x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("X:");
        x = scanner.nextFloat();

        int n;
        System.out.print("N:");
        n = scanner.nextInt();


        float x1 = 1F;
        float n1 = 1F;
        float result = 1.0F;


        for (int i = 1; i <= n; ++i)
        {
            n1 *= (float)i;
            x1 *= x;
            result += x1 / n1;
        }
        System.out.print(result);

    }
}

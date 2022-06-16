package fori;

import java.util.Scanner;

public class for28 {
    public static void main(String[] args) {
        float x;
        Scanner scanner=new Scanner(System.in);

        System.out.print("X:");
        x = scanner.nextFloat();

        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        float temp1 = 1F;
        float temp2 = 1F;
        float result = 1F;
        float pow = 1F;
        int i;
        for (i = 1; i < n; ++i)
        {
            temp1 *= 2 * i - 3;
            temp2 *= 2 * i;
            pow *= (-1) * x;
            result += temp1 * pow / temp2;
        }
        System.out.print(result+"\n");

    }
}

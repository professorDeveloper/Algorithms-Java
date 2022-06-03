package fori;

import java.util.Scanner;

public class for37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        int i;
        int i2;
        float result = 0F;
        float ni;
        for (i = 1; i <= n; ++i)
        {
            ni = i;
            for (i2 = 1; i2 <= i; ++i2)
            {
                ni *= i;
            }
            result += ni;
        }
        System.out.print(result);


    }
}

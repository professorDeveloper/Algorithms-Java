package fori;

import java.util.Scanner;

public class for38 {
    public static void main(String[] args) {
        int n;
        System.out.print("N:");
        Scanner scanner=new Scanner(System.in);

        n = scanner.nextInt();

        float result = 0F;
        float ni;
        for (int i = 1; i <= n; ++i)
        {
            ni = i;
            for (int j = 1; j <= n - i; ++j)
            {
                ni *= i;
            }
            result += ni;
        }
        System.out.print(result);


    }
}

package fori;

import java.util.Scanner;

public class for21 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("N:");
        n = scanner.nextInt();


        float n1 = 1F;
        float result = 1F;



        for (int i = 1; i <= n; ++i)
        {
            n1 *= (float)i;
            result += 1 / n1;
        }
        System.out.print(result);

    }
}

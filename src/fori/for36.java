package fori;

import java.util.Scanner;

public class for36 {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner scanner=new Scanner(System.in);
        System.out.print("N:");
        n = scanner.nextInt();

        System.out.print("K:");
        k = scanner.nextInt();


        int i2;
        float rez = 0F;
        float nk;
        for (int i = 1; i <= n; ++i)
        {
            nk = i;
            for (i2 = 1; i2 <= k; ++i2)
            {
                nk *= i;
            }
            rez += nk;
        }
        System.out.print(rez);

    }
}

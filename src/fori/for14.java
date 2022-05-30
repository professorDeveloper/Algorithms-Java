package fori;

import java.util.Scanner;

public class for14 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        int count = 0;
        int i;
        for (i = 1; i <= (2 * n - 1); i += 2)
        {
            count += i;
            System.out.println(count);

        }

    }
}

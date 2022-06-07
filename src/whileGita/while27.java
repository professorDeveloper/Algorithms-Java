package whileGita;

import java.util.Scanner;

public class while27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("N:");
        n = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f = 0;
        int k = 2;
        while (f < n)
        {
            ++k;
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        System.out.print("k:");
        System.out.print(k);
    }
}

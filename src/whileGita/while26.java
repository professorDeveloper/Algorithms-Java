package whileGita;

import java.util.Scanner;

public class while26 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.print("N:");
        n = scanner.nextInt();

        int f1 = 1;
        int f2 = 1;
        int f = 0;

        while (f < n)
        {
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        System.out.print("F_k - 1 =");
        System.out.print(f2);
        System.out.print("\n");
        System.out.print("F_k+1=");
        System.out.print(f1 + f2);

    }
}

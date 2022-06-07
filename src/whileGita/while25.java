package whileGita;

import java.util.Scanner;

public class while25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n;
        System.out.print("N:");
        n = scanner.nextInt();

        int f1 = 1;
        int f2 = 1;
        int f = 0;

        while (f < n + 1)
        {
            f = f2 + f1;
            f2 = f1;
            f1 = f;
        }
        System.out.print(f);

    }
}

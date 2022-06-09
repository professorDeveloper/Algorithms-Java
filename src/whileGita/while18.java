package whileGita;

import java.util.Scanner;

public class while18 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        int n;
        int r = 0; //
        System.out.print("N: ");// =
        n = scanner.nextInt();
        while (n > 0) {
            int m = n % 10;//m

            n /= 10;
            System.out.print(m);

        }

    }
}

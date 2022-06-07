package whileGita;

import java.util.Scanner;

public class while21 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n;
        System.out.print("N:");
        n = scanner.nextInt();
        while ((n > 0) & ((n % 10) % 2 == 0))
        {
            n /= 10;
        }
        if ((n % 10) % 2 != 0)
        {
            System.out.print("Toq sonlar Bor !");
        }
        else
        {
            System.out.print("Toq sonlar Yo`q !");
        }

    }
}

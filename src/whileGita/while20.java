package whileGita;

import java.util.Scanner;

public class while20 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.print("N:");
        n = scanner.nextInt();
        while ((n > 0) & ((n % 10) != 2))
        {
            n /= 10;
        }
        if ((n > 0) && (n % 10) == 2)
        {
            System.out.print("2 raqami Bor");
        }
        else
        {
            System.out.print("2 raqami Yo`q");
        }
    }
}

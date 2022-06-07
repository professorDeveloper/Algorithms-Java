package whileGita;

import java.util.Scanner;

public class while23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a;
        int b;
        System.out.print("A:");
        a = scanner.nextInt();
        System.out.print("B:");
        b = scanner.nextInt();
        while ((a != 0) & (b != 0))
        {
            if (a > b)
            {
                a = a % b;
            }
            else
            {
                b = b % a;
            }
        }
        System.out.print(a + b);

    }
}

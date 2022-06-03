package whileGita;

import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("n:");
        n = scanner.nextInt();
        int k = 1;
        while (k * k <= n)
        {
            ++k;
        }
        System.out.print(k - 1);
    }
}

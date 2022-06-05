package whileGita;

import java.util.Scanner;

public class while17 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.print("N:");
        n = scanner.nextInt();
        int sum = 0;
        int num = 0;
        while (n > 0)
        {
            ++num;
            sum += n % 10;
            n /= 10;
        }
        System.out.print("Num:");
        System.out.print(num);
        System.out.print("\n");
        System.out.print("Sum:");
        System.out.print(sum);
    }

}


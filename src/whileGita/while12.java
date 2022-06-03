package whileGita;

import java.util.Scanner;

public class while12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("N:");
        n = scanner.nextInt();
        int k = 0;
        int temp = 0;
        while (!(temp + k + 1 > n))
        {
            ++k;
            temp += k;
        }
        System.out.print(k);
        System.out.print("\n");
        System.out.print(temp);

    }
}

package whileGita;

import java.util.Scanner;

public class while9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n;
        System.out.print("N:");

        n = scanner.nextInt();
        int k = 1;
        int temp = 3;
        while (temp <= n)
        {
            temp *= 3;
            ++k;
        }
        System.out.print(k);
    }


}

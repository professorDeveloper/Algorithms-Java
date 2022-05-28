package integer;

import java.util.Scanner;

import static java.lang.System.in;

public class integer28 {
    public static void main(String[] args) {
        int n;
        int k;

        Scanner scanner=new Scanner(in);
        System.out.print("K:");
        k = scanner.nextInt();


        System.out.print("N:");
        n = scanner.nextInt();



        System.out.printf("Hafta ning %d - kuni\n",((k + n - 2) % 7) + 1);

    }
}

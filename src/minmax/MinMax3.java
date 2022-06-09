package minmax;

import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float p;
        float a;
        float b;
        float min = Integer.MIN_VALUE;
        int n;
        System.out.println("N:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.println("A: ");
            a = scanner.nextInt();
            System.out.println("B: ");

            b = scanner.nextInt();
            p = 2*(a + b);


            if (p > min) {
                min = p;
            }

        }
        System.out.printf("Eng kichik yuzali To`rtburchak: %.1f \n", min);

    }
}

package minmax;

import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float s;
        float a;
        float b;
        float min = Integer.MAX_VALUE;
        int n;
        System.out.println("N:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.println("A: ");
            a = scanner.nextInt();
            System.out.println("B: ");

            b = scanner.nextInt();
            s = a * b;


            if (s < min) {
                min = s;
            }

        }
        System.out.printf("Eng kichik yuzali To`rtburchak: %.1f \n", min);

    }
}

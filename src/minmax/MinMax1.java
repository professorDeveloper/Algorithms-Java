package minmax;

import java.util.Scanner;

public class MinMax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.print("n = ");
        n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.print(i + " = ");
            int number = scanner.nextInt(); // i=1
            if (min > number) min = number; // min = 5
            if (max < number) max = number; // max = 5
        }

        System.out.println(max);
        System.out.println(min);
    }
}

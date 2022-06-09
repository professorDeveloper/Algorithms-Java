package minmax;

import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE, minIndex = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "-");
            int a = scanner.nextInt();
            if (min > a) {    // 5 -10 2 9 30
                min = a;      // min = 5
                minIndex = i; // minIndex = 1
            }
        }

        System.out.println(minIndex);
    }
}

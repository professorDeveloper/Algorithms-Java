package minmax;

import java.util.Scanner;

public class MinMax22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //(n>2)  // 8 6 5 4 9 1 3 1 6 1 8 -> 5 4

        int min1 = scanner.nextInt(); // 6
        int min2 = scanner.nextInt(); // 5

        for (int i = 3; i <= n; i++) {
            int num = scanner.nextInt(); // 5
            if (min2 > num) {
                // swap(min2, num) -> qiymatlar almashadi
                int t = min2;
                min2 = num;
                num = t;
            } // min2 = 5; num = 6

            if (min1 > num) min1 = num; // 1 1
        }

        System.out.println(min1);
        System.out.println(min2);

    }
}

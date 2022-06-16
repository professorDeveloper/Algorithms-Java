package minmax;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 10 9 5 6 4 8 12 13
        int n = scanner.nextInt();
//        int min = scanner.nextInt(); // 1-si eng kichik bo'lsin
        int min = Integer.MAX_VALUE; // 1-si eng kichik bo'lsin
        for (int i = 1; i <= n; i++) {
            int m = scanner.nextInt();
            int v = scanner.nextInt();
            int zichlik = m / v;

            if (min > zichlik) min = zichlik;
        }
        System.out.println(min);
    }
}

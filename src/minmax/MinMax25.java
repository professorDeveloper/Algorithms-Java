package minmax;

import java.util.Scanner;

public class MinMax25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int indexMultiply=0;
        int r1 = 0;
        int r2 = 0;
        int minMultiply = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            r2 = r1;
            System.out.print(i + ".");
            r1 = scanner.nextInt();
            if ((i == 2) || (r1 * r2 < minMultiply)) {
                minMultiply = r2 * r1;
                indexMultiply = i;
            }
            //
        }
        System.out.printf("%d %d\n", indexMultiply - 1, indexMultiply);

    }

}

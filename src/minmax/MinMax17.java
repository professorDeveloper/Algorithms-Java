package minmax;

import java.util.Scanner;

public class MinMax17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int maxnum=0;
        int r;
        int max = Integer.MIN_VALUE;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ".");
            r = scanner.nextInt();
            if ((r > max) ) {
                max = r;
                maxnum = i;
            }
        }
        System.out.printf("%d\n", n - maxnum);

    }

}

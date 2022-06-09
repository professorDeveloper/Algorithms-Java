package minmax;

import java.util.Scanner;

public class MinMax13 {
    public static void main(String[] args) {
        int n;
        int r;
        int max = Integer.MIN_VALUE;
        int maxnum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.print(i+".");
            r= scanner.nextInt();
            if ((r % 2 != 0 && r > max) || (i == 1)) {
                max = r;
                maxnum = i;
            }else {
                maxnum=0;
            }
        }
        System.out.printf(" %d",maxnum);

    }
}

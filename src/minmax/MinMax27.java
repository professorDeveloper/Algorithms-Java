package minmax;

import java.util.Scanner;

public class MinMax27 {
    public static void main(String[] args) {
        int b = 2;
        int b2 = 2;
        int num = 0;
        int numi = 0;
        int maxnum = 0;
        int maxi=Integer.MIN_VALUE;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".");
            b = scanner.nextInt();
            if (b2 == b) ++num;
            else {
                if (num > maxnum) {
                    maxnum = num;
                    maxi = numi;
                }
                numi = i;
                num = 1;
            }
        }
        if (num > maxnum) {
            maxnum = num;
            maxi = numi;
        }
        System.out.printf("%d %d\n", maxi, maxnum);

    }

}

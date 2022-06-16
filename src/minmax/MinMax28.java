package minmax;

import java.util.Scanner;

public class MinMax28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 2;
        int num = 0;
        int numi = 1;
        int maxnum = 0;
        int maxi = 0;
        int n;
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".");
            b = scanner.nextInt();
            if (b == 1) {
                ++num;
                maxi = numi;
            } else {
                if (num >= maxnum) {
                    maxnum = num;
                }
                numi = i + 1;
                num = 0;
            }
        }
        if ((num >= maxnum) && (b == 1)) {
            maxnum = num;
            maxi = numi;
        }
        System.out.printf(" %d\n", maxi );



}
}

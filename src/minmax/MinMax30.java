package minmax;

import java.util.Scanner;

public class MinMax30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int ni=0;
        int nmax = 0;
        int num = 0;
        System.out.println("n:");
        n = scanner.nextInt();
        int minnum = n;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".");
            ni = scanner.nextInt();
            if ((i == 1) || (ni > nmax)) {
                nmax = ni;
                num = 0;
                minnum = n;
            }
            if (ni == nmax) {
                ++num;
            } else {
                if (num < minnum) {
                    minnum = num;
                }
                num = 0;
            }
        }
        if ((num < minnum) && (ni == nmax)) {
            minnum = num;
        }
        //

        System.out.println(minnum);
}
}

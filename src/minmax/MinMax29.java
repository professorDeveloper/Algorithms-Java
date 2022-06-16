package minmax;

import java.util.Scanner;

public class MinMax29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int ni=0;
        int nmin=Integer.MAX_VALUE;
        int num = 0;
        int maxnum = 0;
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + '.');
            ni = scanner.nextInt();
            if ((i == 1) || (ni < nmin)) {
                nmin = ni;
                num = 0;
                maxnum = 0;
            }
            if (ni == nmin) {
                ++num;
            } else {
                if (num > maxnum) {
                    maxnum = num;
                }
                num = 0;
            }
        }
        if ((num > maxnum) && (ni == nmin)) {
            maxnum = num;
        }
        //
        System.out.printf("%d\n", maxnum);


}
}

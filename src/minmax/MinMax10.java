package minmax;

import java.util.Scanner;

public class MinMax10 {
    public static void main(String[] args) {
        int n;
        int r;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minnum = 0;
        int maxnum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(i + ".");
            r = scanner.nextInt();
            if ((i == 1) || (r < min)) {
                min = r;
                minnum = i;
            }
            if ((i == 1) || (r > max)) {
                max = r;
                maxnum = i;
            }
        }

        if (maxnum > minnum) {
            System.out.printf("Birinchi uchragan ekstremal:  %d\n", minnum);

        } else if (minnum > maxnum) System.out.printf("Birinchi uchragan ekstremal:  %d\n", maxnum);


    }
}

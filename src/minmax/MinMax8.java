package minmax;

import java.util.Scanner;

public class MinMax8 {
    public static void main(String[] args) {
        int n;
        int minnum1 = 0;
        int minum = 0;
        int r;
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(i+".");
            r= scanner.nextInt();
            if ((i == 1) || (r < min)) {
                min = r;
                minum = i;
            }
            if ((i == 1) || (r <= min1)) {
                min1 = r;
                minnum1 = i;//2 1 3 2 1 4 5 1
            }
        }

        System.out.println("Birinchi uchragan Eng kichik: "+minum);
        System.out.println("Oxirgi uchragan Eng kichik: "+minnum1);


    }
}

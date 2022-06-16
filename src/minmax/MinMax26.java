package minmax;

import java.util.Scanner;

public class MinMax26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int r;
        int num = 0;
        int maxnum = 0;
        System.out.println("n:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            r = scanner.nextInt();

            if (r % 2 == 0) {
                ++num;
            } else {
                if (num > maxnum) {
                    maxnum = num;
                }
                num = 0;
            }
        }
        if (num > maxnum) {
            maxnum = num;
        }

        System.out.println(maxnum);

}
}

package minmax;

import java.util.Scanner;

public class MinMax21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n;
        int counterMax=0;
        int counterMin=0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".");
            r = scanner.nextInt();
            if (i == 1) {
                min = r;
                counterMin = 0;
                max = r;
                counterMax = 0;
            }
            if (r < min) {
                if (min != max) {
                    sum += min * counterMin;
                }
                min = r;
                counterMin = 0;
                //
            }
            //
            if (r > max) {
                if (max != min) {
                    sum += max * counterMax;
                }
                max = r;
                counterMax = 0;
            }
            //
            if (r == min) {
                ++counterMin;
            } else if (r == max)
                ++counterMax;

            else
                sum += r;
        }
        System.out.println(sum / (n - counterMax - counterMin));

    }
}

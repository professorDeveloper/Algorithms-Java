package minmax;

import java.util.Scanner;

public class MinMax16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 5 6 9 1 2 3 5 1 8 7 1 9 10 1 3

        int min = Integer.MAX_VALUE;
        int index = 1;// 1 - uchragan min qayerda?

        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if (min > num) {
                min = num;
                index = i;
            }
        }
        System.out.println(min);
        System.out.println(index - 1);
    }
}

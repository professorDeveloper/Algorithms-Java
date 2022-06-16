package minmax;

import java.util.Scanner;

public class Minmax19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count=0;
        int r;
        int min = Integer.MIN_VALUE;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+".");
            r= scanner.nextInt();
            //
            if ((r < min)|| (i == 1 )) {
                min = r;
                count = 0;
            }
            //
            if (r == min) {
                count++;
            }
        }
        System.out.println(count);

}
}

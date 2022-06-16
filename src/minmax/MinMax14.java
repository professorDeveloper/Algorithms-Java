package minmax;

import java.util.Scanner;

public class MinMax14 {
    public static void main(String[] args) {
        int b;
        int r;
        int min = 0;
        int minnum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("B:");
        b = scanner.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.print(i+".");
            r= scanner.nextInt();
            //
	if ((r > b) && ((r < min) || (minnum == 0)))
            {
	min = r;
	minnum = i;
            }
        }
        System.out.printf("%d %d\n",minnum,min);

    }
}

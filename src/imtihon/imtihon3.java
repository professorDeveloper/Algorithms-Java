package imtihon;

import java.util.Scanner;

public class imtihon3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max1=0;
        int max2=0;
        int max3=0;
        int r;
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".");
            r = scanner.nextInt();
            //
            if (i == 1) {
                max1 = r;
                max2 = r;
                max3 = r;
            }
            //
            if ((r > max3) && (r != max1) && (r != max2)) {
                if (r > max2) {
                    max3 = max2;
                    if (r > max1) {
                        max2 = max1;
                        max1 = r;
                    } else {
                        max2 = r;
                    }
                } else
                    max3 = r;
            }
            //
            if (max1 == max2) {
                max2 = r;
            }
            if ((max3 == max1) || (max3 == max2)) {
                max3 = r;
            }
        }

        System.out.printf("%d ,%d,%d",max1,max2,max3);

    }
}

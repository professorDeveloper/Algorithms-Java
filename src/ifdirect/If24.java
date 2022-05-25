package ifdirect;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, fx;
        System.out.print("x = ");
        x = scanner.nextDouble(); // avval x kiritiladi
        if (x > 0) {
            fx = 2 * Math.sin(x);
        } else {
            fx = x - 6;
        }
        System.out.printf("%.4f",fx);

    }
}

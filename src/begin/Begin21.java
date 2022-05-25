package begin;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3;
        System.out.print("x1 = ");
        x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        y1 = scanner.nextDouble();

        System.out.print("x2 = ");
        x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        y2 = scanner.nextDouble();

        System.out.print("x3 = ");
        x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        y3 = scanner.nextDouble();

        // tomonlari topiladi
        double a, b, c, per, s;
        // x1,y1 dan x2,y2 gacha masofa
        a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        // x2,y2 dan x3,y3 gacha masofa
        b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        // x3,y3 dan x1,y1 gacha masofa
        c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        per = a + b + c;
        System.out.println("Per = " + per);

        // yuza topish Gerun formulasi
        // sqrt(p*(p-a)*(p-b)*(p-c))  -> p = (a + b + c) / 2;
        double p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Yuza = " + s);
    }
}

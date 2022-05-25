package begin;

import java.util.Scanner;

public class begin20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x1;
        int x2;
        int y1;
        int y2;
        int d;
        System.out.print("x1=");
        x1 = scanner.nextInt();
        System.out.print("x2=");
        x2 = scanner.nextInt();
        System.out.print("y1=");
        y1 = scanner.nextInt();
        System.out.print("y2=");
        y2 = scanner.nextInt();
        d =(int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.print("S=");
        System.out.print(d);

    }
}

package integer;

import java.util.Scanner;

public class integer16 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        int f;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Number -> ");
        a = scanner.nextInt();
        b = a / 100;
        c = a - b * 100;
        d = c / 10;
        e = c - d * 10;
        f = b * 100 + d + e * 10;
        System.out.print("Hosil bo'lgan son -> "+f);

    }
}

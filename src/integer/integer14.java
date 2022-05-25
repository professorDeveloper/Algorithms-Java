package integer;

import java.util.Scanner;

public class integer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.print("uch xonali sonni kiriting-> ");
        a = scanner.nextInt();
        b = a / 100;
        c = a - b * 100;
        d = c / 10;
        e = c - d * 10;
        f = b * 10 + d + 100 * e;
        System.out.print("Holat ->"+f);

    }
}

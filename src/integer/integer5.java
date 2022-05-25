package integer;

import java.util.Scanner;

public class integer5 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Berilgan kesma uzunligi: ");
        a =  scanner.nextInt();
        System.out.print("B'olaklari uzunligi: ");
        b = scanner.nextInt();
        c = a / b;
        System.out.print("Bo'laklari soni: "+c);
        d = a - b * c;
        System.out.print("Kesma uzunligi: "+d);

    }
}

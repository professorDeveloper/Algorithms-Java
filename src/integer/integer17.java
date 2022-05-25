package integer;

import java.util.Scanner;

public class integer17 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int a,b,c,d,e;

        System.out.print("to'rt xonali sonni kiriting->");
        a = scanner.nextInt() ;
        b = a / 1000;
        c = a - b * 1000;
        d = c / 100;
        e = c - d * 100;
        System.out.print("Holat -> " +d);

    }
}

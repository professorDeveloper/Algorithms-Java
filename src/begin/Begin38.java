package begin;

import java.util.Scanner;

import static java.lang.System.in;

public class Begin38 {
    /**
     * 5*x+10=0
     * 5*x=-10
     * x = -10 / 5 = -2
     * a*x+b=0
     * x=-b/a
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        float a;
        float b;
        System.out.print("A:");
        a=scanner.nextFloat();

        System.out.print("B:");
        b = scanner.nextFloat();


        System.out.printf("X:%f\n",-1 * b / a);




    }
}

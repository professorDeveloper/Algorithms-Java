package begin;

import java.util.Scanner;

public class begin40 {
    public static void main(String[] args) {
        float A1;
        float B1;
        float C1;
        float A2;
        float B2;
        float C2;
        Scanner scanner=new Scanner(System.in);

        System.out.print("A1:");
        A1 = scanner.nextFloat();


        System.out.print("B1:");
        B1 = scanner.nextFloat();


        System.out.print("C1:");
        C1 = scanner.nextFloat();


        System.out.print("A2:");
        A2 = scanner.nextFloat();


        System.out.print("B2:");
        B2 = scanner.nextFloat();


        System.out.print("C2:");
        C2 = scanner.nextFloat();


        float D;
        D = A1 * B2 - A2 * B1;

        float x;
        float y;
        x = (C1 * B2 - C2 * B1) / D;
        y = (A1 * C2 - A2 * C1) / D;

        System.out.printf("x:%f\ny:%f\n",x,y);


    }
}

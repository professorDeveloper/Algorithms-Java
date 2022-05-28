package begin;

import java.util.Scanner;

public class begin39 {
    public static void main(String[] args) {
        float A;
        float B;
        float C;
        Scanner scanner=new Scanner(System.in);

        System.out.print("A:");
        A = scanner.nextFloat();

        System.out.print("B:");
        B = scanner.nextFloat();


        System.out.print("C:");
        C = scanner.nextFloat();


        float D;
        D = (float) (Math.pow(B,2) - 4 * A * C);

        float x1;
        float x2;
        x1 = (float) (((-1) * B + Math.sqrt(D)) / (2 * A));
        x2 = (float) (((-1) * B - Math.sqrt(D)) / (2 * A));


            System.out.printf("x1:%f\nx2:%f\n",x1,x2);


    }
}

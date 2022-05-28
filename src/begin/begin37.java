package begin;

import java.util.Scanner;

public class begin37 {
    public static void main(String[] args) {
        float v1;
        float v2;
        float s;
        float t;

        Scanner scanner=new Scanner(System.in);

        System.out.print("v1:");
         v1 = scanner.nextFloat();


        System.out.print("V2:");
        v2 = scanner.nextFloat();


        System.out.print("S:");
        s = scanner.nextFloat();


        System.out.print("T:");
         t = scanner.nextFloat();


        System.out.printf("S:%f\n",Math.abs(s - (v1 * t + v2 * t)));


    }
}

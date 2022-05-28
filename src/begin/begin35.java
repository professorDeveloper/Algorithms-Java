package begin;

import java.util.Scanner;

public class begin35 {
    public static void main(String[] args) {
        float v;
        float u;
        float t1;
        float t2;
        float s;
        Scanner scanner=new Scanner(System.in);

        System.out.print("V:");
        v = scanner.nextFloat();


        System.out.print("U:");
        u = scanner.nextFloat();


        System.out.print("T1:");
        t1 = scanner.nextFloat();


        System.out.print("T2:");
        t2 = scanner.nextFloat();



        s = v * t1 + (v - u) * t2;

        System.out.printf("S:%f\n",s);


    }
}

package begin;

import java.util.Scanner;

import static java.lang.System.in;

public class begin33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        float A;
        float Y;
        System.out.print("X:");
        float X = scanner.nextFloat(); ;


        System.out.print("A:");
         A = scanner.nextFloat();


        System.out.print("Y:");
         Y = scanner.nextFloat();
        System.out.print("B:");
     float   B = scanner.nextFloat();

        float price;
        price = A / X;
       int price1 = (int) (B / Y);

        System.out.printf("1 kg  Shokolad:%.2f\n",price);

        System.out.printf("1 kg  Konfet :%d\n", price1);

    }

}

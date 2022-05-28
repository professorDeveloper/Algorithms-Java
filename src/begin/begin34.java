package begin;

import java.util.Scanner;

import static java.lang.System.in;

public class begin34 {
    public static void main(String[] args) {
        float X;
        float A;
        float Y;
        float B;
        Scanner scanner=new Scanner(in);

        System.out.print("X:");
        X  = scanner.nextFloat();


        System.out.print("A:");
        A = scanner.nextFloat();


        System.out.print("Y:");
        Y = scanner.nextFloat();


        System.out.print("B:");
        B = scanner.nextFloat();


        float ChocolatePrice;
        ChocolatePrice = A / X;

        System.out.printf("Shokoladlarning 1 kg narxi:%.2f \n",ChocolatePrice);

        float ToffeesPrice;
        ToffeesPrice = B / Y;

        System.out.printf("Konfet 1kg narxi:%.2f\n",ToffeesPrice);

        System.out.printf("Shokolad kofedan %.2f barobar qimmatroq \n",ChocolatePrice / ToffeesPrice);


    }
}

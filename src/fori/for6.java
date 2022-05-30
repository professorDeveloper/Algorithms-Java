package fori;

import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Narx:");
        float c = scanner.nextFloat();



        for (float m = 1.2F; m < 2.1F; m += 0.1F)
        {
            System.out.printf("%.1f kg = %.1f  \n",m,(c * m));
        }

    }
}

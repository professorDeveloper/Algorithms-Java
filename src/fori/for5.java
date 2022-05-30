package fori;

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        float c;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" 1 kg konfet:");
        c = scanner.nextFloat();
        for (float m = 0.1F; m < 1.1F; m += 0.1F)
        {
            System.out.printf("%.1f m kg = %.1f \n",m,(c*m));
        }

    }
}

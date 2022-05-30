package fori;

import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        float c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Narx:");
        c = scanner.nextFloat();

        for (int i = 1; i <= 10; ++i) {
            System.out.println(i + " kg = "+ c * i);

        }
    }

}


package whileGita;

import java.awt.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Label: while (true) {
            System.out.println("1. Start Game");
            System.out.println("2. Lead board");
            System.out.println("3. About");
            System.out.println("4. Exit");
            System.out.print("Select menu, please: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Start game");
                    break Label;
                }
                case 2 -> System.out.println("Lead board");
                case 3 -> System.out.println("About");
                case 4 -> System.out.println("Exit game");
                default -> System.out.println("Qayta urinib ko'ring");
            }
        }

        System.out.println("Keyingi qadam");

    }
}

package whileGita;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Start Game");
            System.out.println("2. Lead board");
            System.out.println("3. About");
            System.out.println("4. Exit");
            System.out.print("Select menu, please: ");
            int input = scanner.nextInt();

            if (input == 1) System.out.println("Start game");
            if (input == 2) System.out.println("Lead board");
            if (input == 3) System.out.println("About");
            if (input == 4) {
                System.out.println("Exit");
                break;
            }
        }


    }
}

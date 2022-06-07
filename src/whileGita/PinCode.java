package whileGita;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        // pin code to'g'ri kiritilsa keyingi qadamga o'tilsin
        Scanner scanner = new Scanner(System.in);
        int MY_PIN_CODE = 1234;
        int pinCode;
        do {
            System.out.print("Enter pin code: ");
            pinCode = scanner.nextInt();
        } while (pinCode != MY_PIN_CODE);

        while (true) {
            if (pinCode != MY_PIN_CODE) {
                System.out.print("Enter pin code: ");
                pinCode = scanner.nextInt();
            } else break;
        }

        System.out.println("Xush kelibsiz");
    }
}

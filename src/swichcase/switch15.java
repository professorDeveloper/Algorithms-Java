package swichcase;

import java.util.Scanner;

public class switch15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int m;
        System.out.print("Qiymat:");
        n = scanner.nextInt();
        System.out.print("Turi:");
        m = scanner.nextInt();

        switch (n) {
            case 6 -> System.out.print("olti ");
            case 7 -> System.out.print("Yetti ");
            case 8 -> System.out.print("Sakkiz ");
            case 9 -> System.out.print("To`qqiz ");
            case 10 -> System.out.print("O`n ");
            case 11 -> System.out.print("Vallet ");
            case 12 -> System.out.print("Dama ");
            case 13 -> System.out.print("Qirol ");
            case 14 -> System.out.print("Tuz ");
            default -> {
                System.out.println("Bunday Qiymat Yo`q");
            }
        }


        switch (m) {

            case 1 -> System.out.print("G`isht\n");
            case 2 -> System.out.print("Olma\n");
            case 3 -> System.out.print("Chillak\n");
            case 4 -> System.out.print("Qarg`a\n");
            default -> {
                System.out.println("Bunday Tur Yo`q");
                break;
            }
        }

    }
}

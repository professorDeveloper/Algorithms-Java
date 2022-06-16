package imtihon;

import java.util.Scanner;

public class imtihon4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number :");
        int number = scanner.nextInt();
        if (number <= 40 && 10 <= number) {
        } else {
            System.err.println("Sonlar oralig`i 10..40");
        }

        String str = "ta masala";
        if (number / 10 == 1) {
            switch (number) {
                case 10 -> System.out.print("O`n" + str);
                case 11 -> System.out.print("O`n bir" + str);
                case 12 -> System.out.print("O`n ikki" + str);
                case 13 -> System.out.print("O`n uch" + str);
                case 14 -> System.out.print("O`n to`rt" + str);
                case 15 -> System.out.print("O`n besh" + str);
                case 16 -> System.out.print("O`n olti" + str);
                case 17 -> System.out.print("O`n yetti" + str);
                case 18 -> System.out.print("O`n sakkiz" + str);
                case 19 -> System.out.print("O`n to`qqiz" + str);

            }
        } else {
            switch (number / 10) {
                case 2 -> System.out.print("yigirma ");
                case 3 -> System.out.print("o`ttiz ");
                case 4 -> System.out.print("qiriq ");
            }


            switch (number % 10) {
                case 1 -> System.out.print("bir");
                case 2 -> System.out.print("ikki");
                case 3 -> System.out.print("uch");
                case 4 -> System.out.print("to`rt");
                case 5 -> System.out.print("besh");
                case 6 -> System.out.print("olti");
                case 7 -> System.out.print("yetti");
                case 8 -> System.out.print("sakkiz");
                case 9 -> System.out.print("to`qqiz");
            }

            switch (number % 10) {
                case 0, 5, 6, 7, 8, 9, 2, 3, 4, 1 -> System.out.print(str);
            }
        }
    }

}

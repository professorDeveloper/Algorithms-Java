package swichcase;

import java.util.Scanner;

public class switch16 {
        public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("number :");
        int number=scanner.nextInt();
        if (number<69 && 21<number){
            unit(number);
        }
        else {
            System.err.println("Sonlar oralig`i 21...69");
        }
    }
    public static void unit(int number){
        switch (number / 10) {
            case 2 -> System.out.print("yigirma ");
            case 3 -> System.out.print("ottiz ");
            case 4 -> System.out.print("qiriq ");
            case 5 -> System.out.print("ellik ");
            case 6 -> System.out.print("oltmish ");
        }

        switch (number % 10) {
            case 1 -> System.out.print("bir ");
            case 2 -> System.out.print("ikki ");
            case 3 -> System.out.print("uch ");
            case 4 -> System.out.print("to`rt ");
            case 5 -> System.out.print("besh ");
            case 6 -> System.out.print("olti ");
            case 7 -> System.out.print("yetti ");
            case 8 -> System.out.print("sakkiz ");
            case 9 -> System.out.print("to`qqiz ");
        }

        switch (number % 10) {
            case 0, 5, 6, 7, 8, 9, 1, 2, 3, 4 -> System.out.print("yosh ");
        }

    }
}

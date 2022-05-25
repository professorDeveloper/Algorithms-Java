package swichcase;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class swich3 {
    public static void main(String @NotNull [] args) {
        oyfasl(4);
        System.out.println(args.toString());
    }


    public static void oyfasl(int number) {
        if (number > 0 && number <= 12) {
            switch (number) {
                case 12:
                case 1:
                case 2:
                    System.out.println(number + "- oy Qish");
                    break;
                case 4:
                case 5:
                case 3:
                    System.out.println(number + "- oy Bahor");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(number + "- oy Yoz");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(number + "-oy Kuz");
                    break;

            }

        } else {
            System.out.println("Buunday Oy raqamai  Yo`q Oy raqami 1...12 gacha ");

        }
    }
}

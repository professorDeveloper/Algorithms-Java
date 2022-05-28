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

        switch (n)
        {
            case 6:
                System.out.print("olti ");
                break;
            case 7:
                System.out.print("Yetti ");
                break;
            case 8:
                System.out.print("Sakkiz ");
                break;
            case 9:
                System.out.print("To`qqiz ");
                break;
            case 10:
                System.out.print("O`n ");
                break;
            case 11:
                System.out.print("Vallet ");
                break;
            case 12:
                System.out.print("Dama ");
                break;
            case 13:
                System.out.print("Qirol ");
                break;
            case 14:
                System.out.print("Tuz ");
                break;

            default:{
                System.out.println("Bunday Qiymat Yo`q");
                break;
            }
        }


        switch (m)
        {
            case 1:
                System.out.print("G`isht\n");
                break;
            case 2:
                System.out.print("Olma\n");
                break;
            case 3:
                System.out.print("Chillak\n");
                break;
            case 4:
                System.out.print("Qarg`a\n");
                break;
            default:{
                System.out.println("Bundat Tur Yo`q");
                break;
            }
        }

    }
}

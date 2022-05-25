package swichcase;

import java.util.Scanner;

public class swich2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1-> {
                System.out.println("Yomon");

            }
            case 2  -> {
                System.out.println("Qoniqarsiz");

            }
            case 3 -> {
                System.out.println("Qoniqarli ");

            }
            case  4->{
                System.out.println("Yaxshi");

            }
            case 5->{
                System.out.println("A`lo");

            }

            default -> {
                System.out.println("Bunday hafta kuni mavjud emas");
            }
        }

    }
}

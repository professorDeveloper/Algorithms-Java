package example;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sonni kiriting: ");// -> : case: Break shart -> shart emas
        int number= scanner.nextInt();
        switch (number){
            case 1 -> {
                System.out.println("Dushanba");
            }
            case 2-> System.out.println("Seshanba");
            case 3-> System.out.println("Chorshanba");
            case 4-> System.out.println("Payshanba");
            case 5-> System.out.println("Juma");
            case 6-> System.out.println("Shanba");
            case 7-> System.out.println("Yakshanba");
            default -> System.out.println("Bunday hafta kun yo`q !");

        }
    }
}

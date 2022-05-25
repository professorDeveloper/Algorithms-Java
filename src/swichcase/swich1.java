package swichcase;

import java.util.Scanner;

public class swich1 {
        // hafta kuni butun son berilgan
        // shu songa mos bo'lgan hafta kuni nomi chop etilsin
        // 5 -> juma
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hafta = scanner.nextInt();



            switch (hafta) {
                case 1-> {
                    System.out.println("Dushanba");
                    break;
                }
                case 2  -> {
                    System.out.println("Seshanba");
                    break;
                }
                case 3 -> {
                    System.out.println("Chorshanba ");
                    break;
                }
               case  4->{
                    System.out.println("Payshanba");
                break;
                }
                case 5->{
                    System.out.println("Juma");
                    break;
                }
                case  6->{
                    System.out.println("Shanba");
                    break;
                }
                case  7->{
                    System.out.println("Yakshanba");
                    break;
                }
                default -> {
                    System.out.println("Bunday hafta kuni mavjud emas");
                }
            }

        }
}

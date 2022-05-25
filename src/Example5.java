import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weekText = ""; // matn qiymatlarni o'zlashtirish uchun
        int hafta = scanner.nextInt();



        switch (hafta) {
            case 1: {
                weekText = "Dushanba";
                System.out.println("dushanbalik ishlar");
                break;
            }
            case 2: {
                weekText = "Seshanba";
                System.out.println("seshanbalik ishlar");
                break;
            }
            case 3: {
                weekText = "chorshanba";
                System.out.println("chorshanbalik ishlar");
                break;
            }
            default: {
                weekText = "boshqa kun";
                System.out.println("Bunday hafta kuni mavjud emas");
            }
        }
        System.out.println(weekText);

    }
}

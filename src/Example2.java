import java.util.Scanner;

public class Example2 {
    // hafta kuni butun son berilgan
    // shu songa mos bo'lgan hafta kuni nomi chop etilsin
    // 5 -> juma
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekInt = scanner.nextInt();
        String weekText = "";
        if (weekInt == 1) {
            weekText = "Dushanba";
            System.out.println("dushanbalik ishlar");
        } else if (weekInt == 2) {
            weekText = "Seshanba";
            System.out.println("seshanbalik ishlar");
        } else if (weekInt == 3) {
            weekText = "chorshanba";
            System.out.println("chorshanbalik ishlar");
        } else if (weekInt == 4) {
            weekText = "payshanba";
            System.out.println("payshanbalik ishlar");
        } else if (weekInt == 5) {
            weekText = "juma";
            System.out.println("jumalik ishlar");
        } else if (weekInt == 6) {
            weekText = "shanba";
            System.out.println("shanbalik ishlar");
        } else if (weekInt == 7) {
            weekText = "yakshanba";
            System.out.println("yakshanbalik ishlar");
        } else {
            System.out.println("Bunday hafta kuni mavjud emas");
        }
        System.out.println(weekText);
    }
}

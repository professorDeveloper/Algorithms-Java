package swichcase;

import java.util.Scanner;

import static java.lang.System.out;

public class switch13 {
    public static void main(String[] args) {
        int n;
        float x;
        float a;
        float c;
        float h;
        float s;
        Scanner scanner = new Scanner(System.in);
        out.println("==========[Bizda Berilgan]==============");
        out.println("1- Teng yonli Uchburchak Kateti");
        out.println("2- Teng yonli Uchburchak Gipotenuzasi");
        out.println("3- Teng yonli Uchburchak Gipotenuzaga tushurilgan Balandlik");
        out.println("4- Teng yonli Uchburchak Yuzasi ");
        out.println("==========================================");
        out.println("Tanlang :");
        int tanlash = scanner.nextInt();
        switch (tanlash) {
            case 1 -> {
                System.out.print("Katet:");
                x = scanner.nextFloat();

                a = x;
                c = (float) (a * Math.sqrt(2));
                h = c / 2;
                s = c * h / 2;
                System.out.printf("Gipotenuza: %.2f\n", c);
                System.out.printf("Balandlik: %.2f\n", h);
                System.out.printf("Yuza: %.2f\n", s);
            }
            case 2 -> {
                System.out.print("Gipotenuza :");
                x = scanner.nextFloat();

                c = x;
                a = (float) (c / Math.sqrt(2));
                h = c / 2;
                s = c * h / 2;
                System.out.printf("Katet: %.2f\n", a);
                System.out.printf("Balandlik: %.2f\n", h);
                System.out.printf("Yuza: %.2f\n", s);
            }
            case 3 -> {
                System.out.print("Balandlik :");
                x = scanner.nextFloat();

                h = x;
                c = 2 * h;
                a = (float) (c / Math.sqrt(2));
                s = c * h / 2;
                System.out.printf("Katet: %.2f \n", a);
                System.out.printf("Gipotenuza: %.2f \n", c);
                System.out.printf("Yuza: %.2f\n", s);
            }
            case 4 -> {
                System.out.print("Yuza :");
                x = scanner.nextFloat();

                s = x;
                h = (float) Math.sqrt(s);
                c = 2 * h;
                a = (float) (c / Math.sqrt(2));
                System.out.printf("Katet: %.2f",a);
                System.out.printf("Gipotenuza: %.2f",c);
                System.out.printf("Balandlik: %.2f",h);

            }
            default -> {
                out.println("Noto`g`ri Raqam kiritildi !");
            }
        }

    }
}

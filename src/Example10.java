import java.util.Scanner;

public class Example10 {
    // 1..12 oraliqda oy tartibi berilgan
    // 31 kunlik oylarni aniqlansin

    // 6 -> ? 30 kunlik
    // 7 -> ? 31 kunlik
    // 8 -> ? 31 kunlik
    // 2 -> ? 29 kunlik

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 kunlik");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 kunlik");
                break;
            case 2:
                System.out.println("28 yoki 29 kunlik");
            default:
                System.out.println("Oraliqqa tegishli emas");
        }
    }
}

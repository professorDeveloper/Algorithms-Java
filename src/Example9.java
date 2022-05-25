import java.util.Scanner;

public class Example9 {
    // 1..12 oraliqda oy tartibi berilgan
    // 31 kunlik oylarni aniqlansin

    // 6 -> ? 30 kunlik
    // 7 -> ? 31 kunlik
    // 8 -> ? 31 kunlik
    // 2 -> ? 29 kunlik

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month == 10 || month == 12)
            System.out.println("31 kunlik");
        else if(month == 4) System.out.println("30 l");

    }
}

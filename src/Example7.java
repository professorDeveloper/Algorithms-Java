import java.util.Scanner;

public class Example7 {
    // 1..10 oraliqda son berilgan
    // toq yoki juftga tekshirilsin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

/*
        if (1 <= n && n <= 10) {
            if (n % 2 == 1) System.out.println("toq son");
            else System.out.println("juft son");
        } else {
            System.out.println("Oraliqqa tegishli emas");
        }
*/

        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Toq son");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Juft son");
                break;
            default:
                System.out.println("Oraliqqa tegishli emas");
        }
    }
}

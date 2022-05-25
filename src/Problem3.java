import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1: {//qish
                System.out.println("Dekabr");
                System.out.println("Yanvar");
                System.out.println("Fevral");
                break;
            }
            case 2: {//bahor
                System.out.println("Mart");
                System.out.println("Aprel");
                System.out.println("May");
                break;
            }
            case 3: {//yoz
                System.out.println("Iyun");
                System.out.println("Iyul");
                System.out.println("Avgust");
                break;
            }
            case 4: {//kuz
                System.out.println("Sentabr");
                System.out.println("Oktyabr");
                System.out.println("Noyabr");
                break;
            }
            default:
                System.out.println("Fasl aniqlanmadi");
        }

    }
}

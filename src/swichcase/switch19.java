package swichcase;

import java.util.Scanner;

public class switch19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Yil:");
        n = scanner.nextInt();

        System.out.print("Yil: ");

        switch ((n) % 10)
        {
            case 0:
            case 1:
                System.out.print("Oq ");
                break;
            case 2:
            case 3:
                System.out.print("Qora ");
                break;
            case 4:
            case 5:
                System.out.print("Yashil ");
                break;
            case 6:
            case 7:
                System.out.print("Qizil ");
                break;
            case 8:
            case 9:
                System.out.print("Sariq ");
                break;
        }


        switch ((n + 8) % 12)
        {
            case 0:
                System.out.print("Sichqon");
                break;
            case 1:
                System.out.print("Sigir");
                break;
            case 2:
                System.out.print("Yo`lbars");
                break;
            case 3:
                System.out.print("Quyon");
                break;
            case 4:
                System.out.print("Ajdarho");
                break;
            case 5:
                System.out.print("ilon");
                break;
            case 6:
                System.out.print("Ot");
                break;
            case 7:
                System.out.print("Qo`y");
                break;
            case 8:
                System.out.print("Maymun");
                break;
            case 9:
                System.out.print("Tovuq");
                break;
            case 10:
                System.out.print("It");
                break;
            case 11:
                System.out.print("To`ngiz");
                break;
        }

    }
}

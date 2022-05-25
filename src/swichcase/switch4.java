package swichcase;

import java.util.Scanner;

public class switch4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oy Raqamini kiriting :");
      int   month  = scanner.nextInt();

        switch4Function(month);

    }
    public  static  void switch4Function(int month){
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 kunlik");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 kunlik");
                break;
            case 2:
                System.out.println("28 yoki 29 kunlik");
            default:
                System.out.println("Oraliqqa tegishli emas");
        }

    }
}

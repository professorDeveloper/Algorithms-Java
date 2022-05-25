package integer;

import java.util.Scanner;

public class integer10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number:");
        int number =scanner.nextInt();
        int onlar = number / 10;  // 5
        int birlar = number % 10;
        // 6
        System.out.printf("Raqamlar :%d%d",onlar,birlar);

    }
}

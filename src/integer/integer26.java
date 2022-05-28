package integer;

import java.util.Scanner;

import static java.lang.System.in;

public class integer26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        System.out.println("1-yanvar Seshanba");
        int K;
        int number_day;
        System.out.print("1 dan 365 gacha K raqamini kiriting:  ");
        K = scanner.nextInt();
        number_day = (K % 7) + 1;
        System.out.print("Haftaning kuni raqami = "+number_day);
       }
}

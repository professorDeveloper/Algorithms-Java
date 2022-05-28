package integer;

import java.util.Scanner;

import static java.lang.System.in;

public class integer25 {
    public static void main(String[] args) {
        System.out.println("1- yanvar Payshanba");
        Scanner scanner=new Scanner(in);
        int k;
        System.out.print("K:");
        k = scanner.nextInt();


        System.out.printf("Hafta kuni raqami: %d",(k + 3) % 7);

    }
}

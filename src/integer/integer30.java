package integer;

import java.util.Scanner;

public class integer30 {
    public static void main(String[] args) {
        int year;
        System.out.print("Yil:");
        Scanner scanner=new Scanner(System.in);

        year = scanner.nextInt();


        System.out.printf("Bu  %d - asrning yili \n",((year - 1) / 100) + 1);
    }
}

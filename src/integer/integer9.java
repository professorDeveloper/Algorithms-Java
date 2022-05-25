package integer;

import java.util.Scanner;

public class integer9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("number: ");
        int number =scanner.nextInt();
        int yuzlar = number / 100;  // 5
//        int birlar = number % 10;
        // 6
        System.out.printf("Yuzlar xonasidagi soni :%d",yuzlar);

    }
}

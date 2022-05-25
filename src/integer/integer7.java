package integer;

import java.util.Scanner;

public class integer7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();
        int onlar = number / 10;  // 5
        int birlar = number % 10;
        // 6
        int fact=onlar+birlar;
        System.out.println("Raqamlar Yig`indisi:"+fact);

    }
}

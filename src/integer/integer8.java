package integer;

import java.util.Scanner;

public class integer8 {
    public static void main(String[] args) {
        // o'nlar xonasini aniqlash
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();
        int onlar = number / 10;  // 5
        int birlar = number % 10;
        // 6
       int  f = onlar + 10 * birlar ;

        System.out.printf("Raqamlar :%d",f);

    }
}

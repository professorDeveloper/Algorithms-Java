package integer;

import java.util.Scanner;

public class integer12 {
    public static void main(String[] args) {
        int yuzlar;
        int onlar;
        int birlar;
        int e;
        int f;
        Scanner scanner=new Scanner(System.in);
        System.out.println("number: ");
        int number =scanner.nextInt();
        yuzlar = number / 100;
        onlar = number - yuzlar * 100;
        birlar = onlar / 10;
        e = onlar - birlar * 10;
        f = yuzlar + 10 * birlar + 100 * e;
        System.out.print("uning raqamlarining o'rnini almashtirishdan hosil bo'lgan son -> ");
        System.out.print(f);

    }
}

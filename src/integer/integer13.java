package integer;

import java.util.Scanner;

public class integer13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int yuzlar;
        int onlar;
        int birlar;
        int e;
        int f;
        System.out.println("number: ");
        number = scanner.nextInt();
        yuzlar = number / 100;
        onlar = number - yuzlar * 100;
        birlar = onlar / 10;
        e = onlar - birlar * 10;
        f = yuzlar + 100 * birlar + 10 * e;
        System.out.println("Holat:" + f);

    }
}

package integer;

import java.util.Scanner;

public class integer11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int yuzlar;
        int onlar;
        int birlar;
        int e;
        int f;
        System.out.print("uch xonali sonni kiriting-> ");
        a = scanner.nextInt();
        yuzlar = a / 100;
        onlar = a - yuzlar * 100;
        birlar = onlar / 10;
        e = onlar - birlar * 10;
        f = yuzlar + birlar + e;
        System.out.print("uning raqamlarining yig'indisi-> ");
        System.out.print(f);
        // 6

    }
}

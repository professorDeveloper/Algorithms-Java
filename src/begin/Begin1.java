package begin;

import java.util.Scanner;

public class Begin1 {

    // KV tomoni berilgan a berilgan
    // Topish kerak Peremeter: P
    // P = 4*a;
    public static void main(String[] args) {
        // Qiymat kiritish
        Scanner scanner = new Scanner(System.in);
        // o'zlashtirish
        int a, p; // kvadratning tomoni va peremeteri
//        System.out.print("Kvadrat ");
//        System.out.println("tomonini ");
        System.out.print("(Butun son) Kvadrat tomonini kiriting: ");
        a = scanner.nextInt();
        // kompilatsiyadan keyin
        // user tomonidan kiritiladi
        p = 4 * a;
        System.out.println("Kv peremeteri = " + p);
    }
}

import java.util.Scanner;

public class Masala3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, p, s, S;

        System.out.print("a = ");
        a = scanner.nextDouble();

        System.out.print("b = ");
        b = scanner.nextDouble();

        System.out.print("c = ");
        c = scanner.nextDouble();

        S = a*b*c;
        System.out.println("Yuza = " + S);

        p = (a + b + c) / 2 ;
        System.out.println("p = " + p);

        s = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.println("s = " + s);




    }
}

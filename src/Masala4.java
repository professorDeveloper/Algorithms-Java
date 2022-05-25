import java.util.Scanner;

public class Masala4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, r;

        System.out.print("a = ");
        a = scanner.nextDouble();

        System.out.print("c = ");
        c = scanner.nextDouble();

        b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
        System.out.println("b = " + b);

        r = (a + b + c) / (a*b);
        System.out.println("r = " + r);
    }

}

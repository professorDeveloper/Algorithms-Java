import java.util.Scanner;

public class Masala5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,d,s,n;
        System.out.print("a =");
        a = scanner.nextInt();

        System.out.print("d =");
         d = scanner.nextInt();

        System.out.print("n =");
         n = scanner.nextInt();

         s = (2*a)+d*(n-1)/2*n;
        System.out.println("S = "+s);

    }
}

import java.util.Scanner;

public class Masala2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.print("n (9<n<100) = ");
        int n = scanner.nextInt();
        //n=23   23/10=2   23%10=3
        int onlik = n / 10;
        int birlik = n % 10;
        int result = onlik + birlik;

        System.out.println("result = " + result);



    }
}

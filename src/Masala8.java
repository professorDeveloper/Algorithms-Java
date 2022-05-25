import java.util.Scanner;

public class Masala8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int A, B, result;

        System.out.print("A = ");
        A = scanner.nextInt();

        System.out.print("B = ");
        B = scanner.nextInt();

        result = A % B ;
        System.out.println("result = " + result);


    }

}

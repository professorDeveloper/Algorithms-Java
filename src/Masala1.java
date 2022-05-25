import java.util.Scanner;

public class Masala1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n (1000>n>99) = ");
        int n = scanner.nextInt();
        //n=567   567/100=5
        int yuzlar = n / 100;

        System.out.println("yuzlar = " + yuzlar);



    }
}

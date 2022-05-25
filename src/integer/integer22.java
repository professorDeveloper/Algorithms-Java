package integer;

import java.util.Scanner;

public class integer22 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;


        Scanner scanner=new Scanner(System.in);

        System.out.print(" sekund->");
        a = scanner.nextInt();
        b = a / 3600;
        c = a - b * 3600;
        System.out.print(" soat-> "+b);
        System.out.print(" va o'tgan sekund-> "+c);

    }
}

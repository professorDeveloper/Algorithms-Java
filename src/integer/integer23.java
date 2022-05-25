package integer;

import java.util.Scanner;

public class integer23 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kun boshidan boshlab o'tgan sekund->");
        a = scanner.nextInt();
        b = a / 3600;
        c = a - b * 3600;
        d = c / 60;
        e = c - d * 60;
        System.out.print("Kun boshidan boshlab o'tgan  soat-> "+b);
        System.out.print(" minut-> "+d);
        System.out.print(" sekund-> "+e);

    }
}

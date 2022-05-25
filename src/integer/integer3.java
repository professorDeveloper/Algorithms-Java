package integer;

import java.util.Scanner;

public class integer3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Fayl hamjmi Baytda:");
        int l= scanner.nextInt();;
        int m = l / 1024;// to'liq metrlar soni

        System.out.println("Fayl Hamjmi Killobayga aylantirildi KB:"+m);
    }
}

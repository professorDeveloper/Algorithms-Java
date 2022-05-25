package integer;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kg:");
        int l= scanner.nextInt();;
        int m = l / 1000;// to'liq metrlar soni

        System.out.println("T:"+m);
    }
}

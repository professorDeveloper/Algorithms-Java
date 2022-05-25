package integer;

import java.util.Scanner;

public class integer20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sekund;
        int soat;
        System.out.print("sekund -> ");
        sekund = scanner.nextInt();
        soat = sekund / 3600;
        System.out.print("Otgan Soat->"+soat);

    }
}

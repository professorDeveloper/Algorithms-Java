package integer;

import java.util.Scanner;

public class integer19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sekund;
        int minut;
        System.out.print("sekund -> ");
        sekund = scanner.nextInt();
        minut = sekund / 60;
        System.out.print("Minut->");
        System.out.print(minut);

    }
}

package integer;

import java.util.Scanner;

public class integer21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sekundboshlangan;
        int minut;
        int sekundotgan;
        System.out.print("Kun boshidan boshlab o'tgan sekund->");
        sekundboshlangan = scanner.nextInt();
        minut = sekundboshlangan / 60;
        sekundotgan = sekundboshlangan - minut * 60;
        System.out.print("Otgan minut-> "+minut);
        System.out.print(" va o'tgan sekund-> "+sekundotgan);

    }
}

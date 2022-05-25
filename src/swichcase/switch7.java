package swichcase;

import java.util.Scanner;

public class switch7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        int birlik;
        System.out.println("Kg ga convert");
        System.out.println("w = ");
        weight = scanner.nextDouble(); //12.5
        System.out.println("Birlikni tanlang");
        System.out.println("1:kg 2:mg, 3:gr, 4:tn 5:sr ");
        birlik = scanner.nextInt();
        // 1. kg 2.mg, 3.gr, 4.tn 5.sr
        switch (birlik) {
            case 1 -> // kg
                    System.out.printf("%.2f(kg) -> %.2f(kg)", weight, weight);
            case 2 -> // mg 1kg = 1000000 mg
                    System.out.printf("%.2f(mg) -> %.2f(kg)", weight, (weight / 1_000_000L));
            case 3 -> // gr 1kg = 1000 gr
                    System.out.printf("%.2f(gr) -> %.2f(kg)", weight, (weight / 1_000L));
            case 4 -> // tn 1tn = 1000 kg
                    System.out.printf("%.2f(tn) -> %.2f(kg)", weight, weight * 1000);
            case 5 -> // sr 1sr = 100 kg
                    System.out.printf("%.2f(sr) -> %.2f(kg)", weight, weight * 100);
        }

    }
}

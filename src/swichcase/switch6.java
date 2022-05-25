package swichcase;

import java.util.Scanner;

public class switch6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b;
        System.out.println("1 : Detsimetr -> metr");
        System.out.println("2 : Kilometr -> metr");
        System.out.println("3 : Metr -> metr");
        System.out.println("4 : Santimetr -> metr");
        System.out.println("Choose: ");
        int choose= scanner.nextInt();
        switch (choose){
            case 1->{
                System.out.println("Detsimetr:");
                a= scanner.nextDouble();
                double natija=a/10;

                System.out.printf("%.2f Desimetr = %.2f  Metr",a,natija);
                break;
            }
            case 2->{
                System.out.println("Kilometr:");
                a=scanner.nextDouble();
                double natija=a/1000;
                System.out.printf("Metr= %.2f",natija);
                break;
            }
            case 3->{
                System.out.println("Metrni kiriting:");
                a= scanner.nextDouble();
                double natija=a;
                System.out.printf("Metr =%.2f",natija);
            }
            case 4->{
                System.out.println("Santimetr:");
                a= scanner.nextDouble();
                double natija=a/100;
                System.out.printf("%.2f Santimetr  = %.2f Metr",a,natija);
            }
            default -> {
                System.out.println("Noto`g`ri Variant");
            }

        }
    }
}

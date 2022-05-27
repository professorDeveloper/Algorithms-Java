package swichcase;

import java.util.Scanner;

public class switch5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b;
        System.out.println("1 ->  qo`shish");
        System.out.println("2 ->  ayrish");
        System.out.println("3 ->  bo`lish");
        System.out.println("4 ->  ko`paytirish");
        System.out.println("Choose: ");
        int choose= scanner.nextInt();
        switch (choose){
            case 1->{
                System.out.println("1- Sonni kiriting:");
                a= scanner.nextDouble();
                System.out.println("2- Sonni kiriting:");
                b=scanner.nextDouble();
                int natija= (int) (a+b);
                System.out.printf("%d + %d = %d",a,b,natija);
                break;
            }
            case 2->{
                System.out.println("1- Sonni kiriting:");
                a= scanner.nextDouble();
                System.out.println("2- Sonni kiriting:");
                b=scanner.nextDouble();
                int natija= (int) (a-b);
                System.out.printf("%d - %d = %d",a,b,natija);
                break;
            }
            case 3->{
                System.out.println("1- Sonni kiriting:");
                a= scanner.nextDouble();
                System.out.println("2- Sonni kiriting:");
                b=scanner.nextDouble();
                int natija= (int) (a/b);
                System.out.printf("%d / %d = %d",a,b,natija);
            }
            case 4->{
                System.out.println("1- Sonni kiriting:");
                a= scanner.nextDouble();
                System.out.println("2- Sonni kiriting:");
                b=scanner.nextDouble();
                int natija= (int) (a*b);
                System.out.printf("%d * %d = %d",a,b,natija);
            }
            default -> {
                System.out.println("Noto`g`ri Variant");
            }

        }

    }


}

package swichcase;

import java.util.Scanner;

import static java.lang.System.out;

public class switch14 {
    public static void main(String[] args) {

        float x;
        float a;
        float r1;
        float r2;
        float s;

        Scanner scanner = new Scanner(System.in);

        out.println("==========[Bizda Berilgan]==============");
        out.println("1- Teng yonli Uchburchak Kateti");
        out.println("2- Teng yonli Uchburchak Gipotenuzasi");
        out.println("3- Teng yonli Uchburchak Gipotenuzaga tushurilgan Balandlik");
        out.println("4- Teng yonli Uchburchak Yuzasi ");
        out.println("==========================================");
        out.println("Tanlang :");
        int tanlash = scanner.nextInt();
        switch (tanlash) {
            case 1 -> {
                out.println("Tomoni :");
                x = scanner.nextFloat();
                a = x;
                r1 = (float) (a * Math.sqrt(3) / 6);
                r2 = 2 * r1;
                s = (float) (a * a * Math.sqrt(3) / 4);
                System.out.printf("Ichki chizlgan aylana radiusi: %.2f \n",r1);
                System.out.printf("Tashqi   chizlgan aylana radiusi: %.2f \n",r2);
                System.out.printf("Yuza: %.2f",s);

            }
            case 2->{
                System.out.println("Ichki chizilgan Aylana Raduis :");
                x = scanner.nextFloat();

                r1 = x;
                a = (float) (r1 * 6 / Math.sqrt(3));
                r2 = 2 * r1;
                s = (float) (a * a * Math.sqrt(3) / 4);
                System.out.printf("Tomoni: %.2f \n",a);
                System.out.printf("Tashqi chizilgan aylana raduis: %.2f \n",r2);
                System.out.printf("Yuzasi: %.2f\n",s);

            }
            case 3->{
               System. out.println("Tashqi chizilgan Aylana Raduis :");
                x = scanner.nextFloat();

                r2 = x;
                r1 = r2 / 2;
                a = (float) (r1 * 6 / Math.sqrt(3));
                s = (float) (a * a * Math.sqrt(3) / 4);
                System.out.printf("Tomoni: %.2f \n",a);
                System.out.printf("Ichki chizilgan aylana raduis %.2f \n",r1);
                System.out.printf("Yuza :%.2f",s);
            }
            case 4->{
                System.out.println("Yuza  :");
                x = scanner.nextFloat();

                s = x;
                a = (float) Math.sqrt(s * 4 / Math.sqrt(3));
                r1 = (float) (a * Math.sqrt(3) / 6);
                r2 = 2 * r1;
                System.out.printf("Tomoni: %.2f \n",a);
                System.out.printf("Ichki aylana raduis: %.2f \n",r1);
                System.out.printf("Tashqi aylana raduis: %.2f \n",r2);
            }
            }

    }
}


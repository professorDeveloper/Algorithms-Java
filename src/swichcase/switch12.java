package swichcase;

import java.util.Scanner;

import static java.lang.System.out;

public class switch12 {
    public static void main(String[] args) {

        out.println("==========[Bizda Berilgan]==============");
        out.println("1- Doira Radiuisi");
        out.println("2- Doira Diametri");
        out.println("3- Doira uzunligi");
        out.println("4- Doira yuzasi");
        out.println("==========================================");
        out.println("Tanlang :");
        Scanner scanner = new Scanner(System.in);
        int tanlash = scanner.nextInt();
        switch (tanlash) {
            case 1 -> {
                out.println("Radiuis:");
                int raduis = scanner.nextInt();

                        int d = raduis * 2;
                        out.println("Doira Diametr: " + d);


                        int l = (int) (2 * Math.PI * raduis);
                        out.println("Doira Uzinligi: " + l);

                        int s = (int) Math.pow(raduis, 2);
                        int doiras = (int) (Math.PI * s);
                        out.println("Doira Yuzasi: " + doiras);
                        break;

            }
            case 2 -> {
                out.println("Diametr:");
                int diametr = scanner.nextInt();
                        int d = diametr / 2;
                        out.println("Doira Raduisi: " + d);


                        int raduis1 = diametr / 2;
                        int l = (int) (2 * Math.PI * raduis1);
                        out.println("Doira Uzinligi: " + l);

                        int raduis = diametr / 2;

                        int s = (int) Math.pow(raduis, 2);
                        int doiras = (int) (Math.PI * s);
                        out.println("Doira Yuzasi: " + doiras);

            }
            case 3 -> {
                out.println("Doira Uzunligi:");
                int uzunligi = scanner.nextInt();

                        int raduis1 = (int) (uzunligi/(2*Math.PI));
                        out.println("Doira Raduisi: " + raduis1);
                        int raduis2 = (int) (uzunligi/(2*Math.PI));
                        int l = (int) (2 * Math.PI * raduis2);
                        out.println("Doira Uzinligi: " + l);

                        int raduis3 = (int) (uzunligi/(2*Math.PI));
                        int s = (int) Math.pow(raduis3, 2);
                        int doiras = (int) (Math.PI * s);
                        out.println("Doira Yuzasi: " + doiras);

            }
            case 4->{
                out.println("Doira Yuzasi:");
                int yuza = scanner.nextInt();


                        double raduis1 = (double) Math.sqrt(yuza/Math.PI);
                        out.printf("Doira Raduisi: %.2f " , raduis1);

                        int raduis2 = (int) Math.sqrt(yuza/Math.PI);
                        int d = raduis2*2;
                        out.println("Doira Diametr: " + d);

                        int raduis3 = (int) Math.sqrt(yuza/Math.PI);
                        int l = (int) (2 * Math.PI * raduis3);
                        out.println("Doira Uzunligi: " + l);

            }
            default -> {
                out.println("Noto`g`ri Raqam Kiritildi !");
            }
        }


    }
}

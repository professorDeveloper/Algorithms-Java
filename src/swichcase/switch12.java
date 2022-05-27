package swichcase;

import java.util.Scanner;

public class switch12 {
    public static void main(String[] args) {
        System.out.println("==========[Bizda Berilgan]==============");
        System.out.println("1- Doira Radiuisi");
        System.out.println("2- Doira Diametri");
        System.out.println("3- Doira uzunligi");
        System.out.println("4- Doira yuzasi");
        System.out.println("==========================================");
        System.out.println("Tanlang :");
        Scanner scanner = new Scanner(System.in);
        int tanlash = scanner.nextInt();
        switch (tanlash) {
            case 1 -> {
                System.out.println("Radiuis:");
                int raduis = scanner.nextInt();
                System.out.println("1- Doira Diametri Aniqlash");
                System.out.println("2- Doira uzunligi Aniqlash");
                System.out.println("3- Doira yuzasi  Aniqlash");
                System.out.println("tanlang :");
                int aniqlash = scanner.nextInt();
                switch (aniqlash) {
                    case 1 -> {
                        int d = raduis * 2;
                        System.out.println("Doira Diametr: " + d);

                        break;
                    }
                    case 2 -> {
                        int l = (int) (2 * Math.PI * raduis);
                        System.out.println("Doira Uzinligi: " + l);
                        break;
                    }
                    case 3 -> {
                        int s = (int) Math.pow(raduis, 2);
                        int doiras = (int) (Math.PI * s);
                        System.out.println("Doira Yuzasi: " + doiras);
                        break;
                    }
                }
                break;
            }
            case 2 -> {
                System.out.println("Diametr:");
                int diametr = scanner.nextInt();
                System.out.println("1- Doira Raduisini Aniqlash");
                System.out.println("2- Doira uzunligi Aniqlash");
                System.out.println("3- Doira yuzasi  Aniqlash");
                int aniqlash = scanner.nextInt();
                switch (aniqlash) {
                    case 1 -> {
                        int d = diametr / 2;
                        System.out.println("Doira Raduisi: " + d);

                        break;
                    }
                    case 2 -> {
                        int raduis = diametr / 2;
                        int l = (int) (2 * Math.PI * raduis);
                        System.out.println("Doira Uzinligi: " + l);
                        break;
                    }
                    case 3 -> {
                        int raduis = diametr / 2;

                        int s = (int) Math.pow(raduis, 2);
                        int doiras = (int) (Math.PI * s);
                        System.out.println("Doira Yuzasi: " + doiras);
                        break;
                    }
                }
                break;
            }
            case 3 -> {
                System.out.println("Doira Uzunligi:");
                int uzunligi = scanner.nextInt();
                System.out.println("1- Doira Raduisini Aniqlash");
                System.out.println("2- Doira Diametrini Aniqlash");
                System.out.println("3- Doira yuzasi  Aniqlash");
                int aniqlash = scanner.nextInt();
                switch (aniqlash) {
                    case 1 -> {
                        int raduis = (int) (uzunligi/(2*Math.PI));
                        System.out.println("Doira Raduisi: " + raduis);
                        break;
                    }
                    case 2 -> {
                        int raduis = (int) (uzunligi/(2*Math.PI));
                        int l = (int) (2 * Math.PI * raduis);
                        System.out.println("Doira Uzinligi: " + l);
                        break;
                    }
                    case 3 -> {
                        int raduis = (int) (uzunligi/(2*Math.PI));
                        int s = (int) Math.pow(raduis, 2);
                        int doiras = (int) (Math.PI * s);
                        System.out.println("Doira Yuzasi: " + doiras);
                        break;
                    }
                }
                break;
            }
            case 4->{
                System.out.println("Doira Yuzasi:");
                int yuza = scanner.nextInt();
                System.out.println("===========================================");
                System.out.println("1- Doira Raduisini Aniqlash");
                System.out.println("2- Doira Diametrini Aniqlash");
                System.out.println("3- Doira Uzunligini  Aniqlash");
                System.out.println("===========================================");

                int aniqlash = scanner.nextInt();
                switch (aniqlash) {
                    case 1 -> {

                        double raduis = (double) Math.sqrt(yuza/Math.PI);
                        System.out.printf("Doira Raduisi: %.2f " , raduis);
                        break;
                    }
                    case 2 -> {
                        int raduis = (int) Math.sqrt(yuza/Math.PI);
                        int d = raduis*2;
                        System.out.println("Doira Diametr: " + d);
                        break;
                    }
                    case 3 -> {
                        int raduis = (int) Math.sqrt(yuza/Math.PI);
                        int l = (int) (2 * Math.PI * raduis);
                        System.out.println("Doira Uzunligi: " + l);
                        break;
                    }
                }
                break;
            }
            default -> {
                System.out.println("Noto`g`ri Raqam Kiritildi !");
            }
        }


    }
}

package fun;

public class Fun54 {
    public static void main(String[] args) {

        PrevDate(1, 1, 2001);//
        PrevDate(1, 3, 2000);
        PrevDate(1, 3, 2001);
        PrevDate(15, 5, 2001);
        
        PrevDate(1, 3, 2020);
        PrevDate(29, 2, 2019);
//        PrevDate(29,);
    }

    public static void PrevDate(int d, int m, int y) {

        if (m == 1 && d == 1) {
            y--;
            m = 12;

            System.out.print(y + ".");
            System.out.print(MonthDay(y, m)+".");
            System.out.print(m + "\n");


        }  else if (d == 29 && m == 2) {
            if (MonthDay(y, m) == 29) {
                d--;
                System.out.print(y + ".");//2000
                System.out.print(m + ".");
                System.out.print(d + "\n");//1.
            } else if (MonthDay(y, m) == 28) {
                System.out.println("Bunday kun yo`q");
            }
        }else if (d == 1) {
            m--;

            System.out.print(y + ".");//2000
            System.out.print(MonthDay(y, m)+".");
            System.out.print(m + "\n");

        } else if (d > 1 && d < 32) {
            d--;
            System.out.print(y + ".");//2000
            System.out.print(d + ".");
            System.out.print(m + "\n");
        }

    }

    public static int MonthDay(int y, int m) {
        int b, c, f;
        b = y % 100;//1300 = b ==> 00
        c = y % 400;//1300-1200= c ==> 100
        f = y % 4;
        if (b == 0) {
            if (c == 0) {
                switch (m) {
                    case 1, 3, 5, 7, 8, 10, 12 -> m = 31;
                    case 2 -> m = 29;
                    case 4, 6, 9, 11 -> m = 30;
                }
            } else {
                switch (m) {
                    case 1, 3, 5, 7, 8, 10, 12 -> m = 31;
                    case 2 -> m = 28;
                    case 4, 6, 9, 11 -> m = 30;
                }
            }
        } else {
            if (f == 0) {
                switch (m) {
                    case 1, 3, 5, 7, 8, 10, 12 -> m = 31;
                    case 2 -> m = 29;
                    case 4, 6, 9, 11 -> m = 30;
                }
            } else {
                switch (m) {
                    case 1, 3, 5, 7, 8, 10, 12 -> m = 31;
                    case 2 -> m = 28;
                    case 4, 6, 9, 11 -> m = 30;
                }
            }
        }
        return m;
    }


}

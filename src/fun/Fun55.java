package fun;

public class Fun55 {
    public static void main(String[] args) {
        NextDate(2001, 2, 28);//28-fevral 2001
        NextDate(2000, 2, 28);//29.02.2000
        NextDate(1991, 12, 31);//1.1.1992
        NextDate(2004, 9, 30);//1.10.2004
        NextDate(2007, 10, 31);//1.11.2007
        NextDate(2007, 10, 15);//16.10.2007
    }

    public static void NextDate(int y, int m, int d) {//d =31 m=12 y=2001
        if (m == 12 && d == 31) {
            y++; //y=2002
            m = 1; //m=1
            d = 1;
            System.out.print(y + "."); //2002.
            System.out.print(m + ".");//.1
            System.out.print(d + "\n");//1.
        } else if (d == 27 && m == 2) {
            //day==27  d++;
            d++;
            System.out.print(y + ".");//2000
            System.out.print(m + ".");
            System.out.print(d + "\n");//1.
        } else if (d == 28 && m == 2) {
            if (MonthDay(y, m) == 29) {
                d++;
                System.out.print(y + ".");//2000
                System.out.print(m + ".");
                System.out.print(d + "\n");//1.
            } else if (MonthDay(y, m) == 28) {
                m++;
                d = 1;
                System.out.print(y + ".");//2000
                System.out.print(m + ".");
                System.out.print(d + "\n");//1.
            }
        }
        //day==28 d++; Kabisa 29  28 if m==28 d=1;
        else if (d > 1 && d < 30) {
            d++;
            System.out.print(y + ".");//2000
            System.out.print(m + ".");
            System.out.print(d + "\n");//1.
        } else if (d == 30) {
            m++;
            d = 1;
            System.out.print(y + ".");//2000
            System.out.print(m + ".");
            System.out.print(d + "\n");//1.
        } else if (d == 31) {//1999.4.30 =1999.5.1
            m++;
            d = 1;
            System.out.print(y + ".");//2000
            System.out.print(m + ".");
            System.out.print(d + "\n");//1.

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

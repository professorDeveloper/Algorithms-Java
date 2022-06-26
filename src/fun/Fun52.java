package fun;
/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> fun
 * Class Date -> 6/20/2022/ 21:30 PM
 */
public class Fun52 {
    public static void main(String[] args) {
        System.out.println (IsLeapYear (2000));
        System.out.println (IsLeapYear (2004));
        System.out.println (IsLeapYear (2008));
        System.out.println (IsLeapYear (2020));
        System.out.println (IsLeapYear (2010));
    }
    public static boolean IsLeapYear(int y) {//2020 100
        int b, d, e, c, f;
        b = y % 100;//1300 = b ==> 00
        c = y % 400;//1300-1200= c ==> 100
        f = y % 4;
        if ( b == 0 ) {
            if ( c == 0 ) {
                return true;


            } else {
                return false;
            }
        } else {
            if ( f == 0 ) {
                return true;
            } else {
                return false;
            }
        }
    }
}

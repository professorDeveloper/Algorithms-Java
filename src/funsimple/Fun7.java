package funsimple;

public class Fun7 {

    public static void main(String[] args) {
        invertDigit(123);
        invertDigit(100);
        invertDigit(1);
        invertDigit(13);
        invertDigit(-123456); // 654321
    }

    /**
     * 123 -> 321
     * 123456789 -> 987654321
     * 2 -> 2
     * 10 -> 01
     * 100000 -> 000001
     **/
    // 1234 -> 32
    // 4: 1234 % 10; n = 123 / 10 -> 12
    // 3: 123 % 10; n = 123 / 10 -> 12
    // 2: 12 % 10;  n = 12 / 10 -> 1
    // 1: 1 % 10    n = 0

    //1- sonni  berilgan sonni  10 ga qoldiqli bo'l, sout(qoldiq)
    //2- keyin, berilgan sonni 10 ga butun bo'l n ga o'zlashtir
    //3- agar n>0 bo'lsa 1-qadamga qayt
    public static void invertDigit(int number) {
        // 123
//        number = Math.abs(number);
        while (number > 0) {
            int qoldiq = number % 10; // 3
            System.out.print(qoldiq);
            number = number / 10; // 12
        }
        System.out.println();
    }
}

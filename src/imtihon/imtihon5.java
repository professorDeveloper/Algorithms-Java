package imtihon;

public class imtihon5 {
    public static void main(String[] args) {
        System.out.println(tub(2));//true
        System.out.println(tub(24));//false
        System.out.println(tub(51));//false
    }

    // n = 51
    // 2 3 4 5 ... 50
    public static boolean tub(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0){

                return false; // tub emas

            }
            i++;
        }
        return true; // tub son
    }
    }


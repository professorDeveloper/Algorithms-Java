public class Fun8 {
    public static void main(String[] args) {

        addRightDigit(13, 9);
    }

    public static void addRightDigit(int k, int r) {
        int kr = 0;
        if (1 <= r && r <= 9) {
            kr = k * 10 + r;
            System.out.println(kr);
        } else {
            System.out.println("r 9 dan katta yoki 1 dan kichik son !");
        }
    }
}

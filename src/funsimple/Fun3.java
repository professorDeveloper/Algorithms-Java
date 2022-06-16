package funsimple;

public class Fun3 {
    public static void main(String[] args) {
        MEAN(3,4,5,6);
        MEAN(6,7,8,9);
        MEAN(6,7,8,9);
        MEAN(4,5,9,2);
    }

    public static void MEAN(int a, int b, int c, int d) {
        int ab = (a + b) / 2;
        int ac = (a + c) / 2;
        int ad = (a + d) / 2;
        System.out.printf("%d  va %d  juftlikning O`rta arifmetiki: %d \n", a, b, ab);
        System.out.printf("%d  va %d  juftlikning O`rta arifmetiki: %d \n", a, c, ac);
        System.out.printf("%d  va %d  juftlikning O`    rta arifmetiki: %d \n", a, d, ad);
    }
}

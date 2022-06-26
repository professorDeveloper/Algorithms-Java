package array;

//import array.util.ArrayUtil;

public class Array4 {
    public static void main(String[] args) {

        geometricProgressia(2, 2, new int[]{1, 2, 3, 4, 5, 6, 7, 8});

    }

    public static void geometricProgressia(int a, int d, int[] array) {
        array[0] = a;
        int pow = 1;
        for (int i = 1; i < array.length - 1; i++) {
            pow *= d;
            array[i] = array[0] * pow;
        }
//        ArrayUtil.show(array);
    }
}

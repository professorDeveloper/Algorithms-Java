package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array40
 * Copyright © : 6/24/2022
 */
public class Array40 {
    public static void main(String[] args) {
        arrayR(new int[]{1,11,2,4,6,7,9,1 },5);
    }

    public static void arrayR(int[] array, int r) {
        int min = Math.abs(array[0] - r);
        int k = 1;
        for (int i = 1; i < array.length; ++i) {
            if (Math.abs(array[i] - r) < min) {
                min = (Math.abs(array[i] - r));
                k = i;
            }

        }
        System.out.println(array[k]);
    }
}

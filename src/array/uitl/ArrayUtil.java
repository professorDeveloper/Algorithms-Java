package array.uitl;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array.uitl
 * Class Name -> ArrayUtil
 * Copyright © : 6/25/2022
 */

public class ArrayUtil {

    /*
        public static void show(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    */
    // foreach
    // 1 2 5 9 8 -10 -23 36
    public static void show(int[] array) {
        for (int item : array) {
            // i-elementni tanlab beradi
            System.out.print(item + "\t");
        }

    }

}
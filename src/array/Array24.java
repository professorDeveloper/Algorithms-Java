package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array24
 * Copyright © : 6/23/2022
 */


public class Array24 {
    public static void main(String[] args) {
        // test1 ap
        // dastlabki hadi 3, ayirmasi 7 10 haddan iborat
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 333, 21, 3};
        int test = array24(arr1);
        System.out.println(test);
    }

    public static int array24(int[] array) {
        // 1 - Arifmetik progressiyami?
        // ha bo'lsa, return array[1]-array[0]
        // yo'q return 0;
        if (array.length == 0 || array.length == 1) return 0;
        // ....
        int d = array[1] - array[0];
        int counter = 1; // sikllar soni
        for (int i = 2; i < array.length; i++) {
            counter++;
            if (array[i] - array[i - 1] != d) {
                System.out.println(" " + counter);
                return 0; // arifmetik progressiya emas
            }
        }
        System.out.println(" " + counter);
        return d;

    }

}

package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array49
 * Copyright © : 6/25/2022
 */
public class Array49 {
    public static void main(String[] args) {
        array49(new int[]{31,32,23,31});
    }

    public static void array49(int[] array) {
        int j;
        int i;
        for (i = 1; i <= array.length; i++) {
            for (j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    j = array.length + 100;
                    break;
                }

            }
            if (j != array.length + 100) {
                System.out.print(i+" ");
            }


        }
        if (i == array.length + 1) {
            System.out.println(0+" ");
        }
    }
}

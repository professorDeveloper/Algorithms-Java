package array;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array19
 * Copyright © : 6/23/2022
 */
public class Array19 {
    public static void main(String[] args) {

        arraySample(new int[]{10,2,4,5,6,78,11,88});
    }

    public static void arraySample(int[] array) {
        int k = array.length - 1;
        while ((array[0] >= array[k]) || (array[k] >= array[array.length - 1]) && (k > 0)) {
            --k;
        }
        if (k == 0) System.out.println(k);
        else{
            System.out.println(array[k]);
        } }
}

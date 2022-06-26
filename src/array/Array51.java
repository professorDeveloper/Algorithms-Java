package array;

import array.uitl.ArrayUtil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array51
 * Copyright © : 6/25/2022
 */
public class Array51 {
    public static void main(String[] args) {
        array51(new int[]{5,6,7,8},new int[]{1,2,3,4});
    }

    public static void array51(int[] arrayA,int[] arrayB ) {
        int s=0;

        for (int i = 0; i < arrayA.length; i++) {
                arrayA[i] = arrayA[i]+arrayB[i];
                arrayB[i] =arrayA[i]-arrayB[i];
                arrayA[i] =arrayA[i]-arrayB[i];

        }
        ArrayUtil.show(arrayA);
        ArrayUtil.show(arrayB);
    }
}

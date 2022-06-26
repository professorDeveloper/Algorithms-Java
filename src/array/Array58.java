package array;

import array.uitl.ArrayUtil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array58
 * Copyright © : 6/26/2022
 */
public class Array58 {
    public static void main(String[] args) {
        array58(new int[]{
                1,2,3,4,5,6,7,8,9,10,11,12,13,14
        });
    }
    public static void array58(int[]array){
        int[] array2 =new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i]=0;
            for (int j = 0; j <=i; j++) {
                array2[i]+=array[j];
            }
        }
        ArrayUtil.show(array2);
        
    }
}

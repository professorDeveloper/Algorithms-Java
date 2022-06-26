package array;

import array.uitl.ArrayUtil;

import java.lang.reflect.Array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array52
 * Copyright © : 6/26/2022
 */
public class Array52 {
    public static void main(String[] args) {
        array52(new int[]{5,12,4,3,7,3,4},new int[]{3,2,6,12,4,17,32});
    }
    public static void array52(int []array1, int [] array2){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]<5){
                array2[i]=2*array1[i];

            }else {
                array2[i]=array1[i]/2;
            }
            
        }
        ArrayUtil.show(array2);
    }
}

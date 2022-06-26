package array;

import array.uitl.ArrayUtil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array53
 * Copyright © : 6/26/2022
 */
public class Array53 {
    public static void main(String[] args) {
        array53(new int[]{
                4,5,6,2,3,20
        },new int[]{
                4,2,3,6,71,9
        });
    }
    public static void array53(int []array1 ,int[]array2){
        int []array3 =new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > array2[i]) array3[i] = array1[i];
            else array3[i]=array2[i];
        }
        ArrayUtil.show(array3);
    }
}

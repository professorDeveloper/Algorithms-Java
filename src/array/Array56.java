package array;

import array.uitl.ArrayUtil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array56
 * Copyright © : 6/26/2022
 */
public class Array56 {
    public static void main(String[] args) {
        array56(new int[]{
                1,2,3,4,5,6,7,8,9,10,11,12,13,14
        });
    }
    public static void array56(int [] array){
        int counter=0;
        int[] array2 =new int[array.length];
        for (int i = 0; i < array.length; i+=3) {
            array2[counter]=array[i];
            counter++;
        }
        System.out.println("Array Size: "+counter);
        ArrayUtil.show(array2);
    }
}

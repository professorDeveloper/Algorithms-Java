package array;

import array.uitl.ArrayUtil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array55
 * Copyright © : 6/26/2022
 */
public class Array55 {
    public static void main(String[] args) {
        array55(new int[]{
                1,2,3,4,5,6,7,8
        });
    }
    public static void array55(int[] array1){
        int counter=0;
        int[] array2 =new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2!=0){
                array2[counter]=array1[i];
                counter++;
            }
        }
        System.out.println("Array Size:"+counter);
        ArrayUtil.show(array2);
    }
    }


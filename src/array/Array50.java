package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array50
 * Copyright © : 6/25/2022
 */
public class Array50 {
    public static void main(String[] args) {

        array50(new int[]{1,3,5,2,5,61});//4,5,3,6
    }

    public static void array50(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length-1; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i]>array[j]){//
                    num++;
                }
            }
        }
        System.out.println(num);
    }

}

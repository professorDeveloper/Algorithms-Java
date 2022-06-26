package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array36
 * Copyright © : 6/23/2022
 */
public class Array36 {
    public static void main(String[] args) {
        array36(new int[]{2,21,15,5,8,2,32,10,9,12,9});
    }
    public static void array36(int [] array){
        int max=0;
        for (int i = 1; i < array.length-1 ; i++) {
            if (!((array[i - 1] < array[i]) && (array[i] > array[i + 1])) && !((array[i - 1] > array[i]) && (array[i] < array[i + 1]))) {
                max=array[i];
            }
        }
        if ((array[0]==array[1])&&((array[0]>max))){
            max=array[0];
        }
        if ((array[array.length-1]==array[array.length-2])&&((array[array.length-1]>max))){
            max=array[array.length-1];

        }
        System.out.println(max);
    }
}

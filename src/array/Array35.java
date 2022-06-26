package array;


/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array35
 * Copyright © : 6/23/2022
 */
public class Array35 {
    public static void main(String[] args) {
        array35(new int[]{1,3,2,4,6,5,9,1});
        array35(new int[]{1,11,2,4,6,5,9,1,});
    }
    public static void array35(int []array){
        int min=Integer.MAX_VALUE;
        for (int i = 1; i < array.length-1; i++) {
            if ((array[i-1]<array[i]) && (array[i]>array[i+1])){
                if (array[i]<min){
                    min=array[i];
                }

            }//
        }
        System.out.println(min);
    }
}

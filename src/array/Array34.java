package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array34
 * Copyright © : 6/23/2022
 */
public class Array34 {
    public static void main(String[] args) {
        array34(new int[]{2,1,3,4,5,6,7,4,8,2,9});
    }
    public static void array34(int []array){

        int max=0;
        for (int i = 1; i < array.length-1 ; ++i) {
            if ((array[i-1]>array[i]) &&(array[i]<array[i+1])){

                if (array[i]>max ){

                    max=array[i];
                }
            }
        }
        if ((array[0]<array[1])&& (array[0]>max)){
            max=array[0];
        }
        if ((array[array.length-1]<array[array.length-2]) && (array[array.length-1]>max)){
            max=array[array.length-1];
        }
        System.out.println(max);
   }
}

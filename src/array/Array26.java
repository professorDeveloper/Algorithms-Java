package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array26
 * Copyright © : 6/23/2022
 */
public class Array26 {
    public static void main(String[] args) {
        array26(new int[]{1,3,7,9,5,2,4,6,8,20});//ketma-ketlik buzilmagan toq va juft ketma-ketlik
    }
    public static void array26(int[]array){
        int i;

        int n=array[0]%2;
        for ( i=1; (i < array.length) && (n!=array[i]%2); i++) {
            n=array[i]%2;//

        }
        if (i==n) {
            System.out.println(0);
        } else {
            System.out.println(i+1);
        }
    }
}

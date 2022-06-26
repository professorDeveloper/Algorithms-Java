package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array27
 * Copyright © : 6/23/2022
 */
public class Array27 {
    public static void main(String[] args) {
        array(new int[]{-1,-3,-2,-6,2,3,4,5,6});
    }
    public static void array(int []array){
        boolean n;
        int i;
        n=(array[1]>0);
        for ( i = 2;( i < array.length) && (n!=array[i]>0) ; i++) {
            n=array[i]>0;
        }
        if (i==array.length+1) System.out.println(0);
        else System.out.println(i);
    }
}

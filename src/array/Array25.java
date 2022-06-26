package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array25
 * Copyright © : 6/23/2022
 */
public class Array25 {
    public static void main(String[] args) {
        int[]ar1={2,4,8,16,32,64};
        int[]ar2={2,4,8,16,32,64,5};
        System.out.println (geometricProgress (ar1));
        System.out.println (geometricProgress (ar2));
    }
    public static int geometricProgress(int[] a) {
        int g = 0;
        for (int i = a.length-1; i > 0; i--) {
            g=a[i]/a[i-1];
            if ( g!=2 ){
                g=0;
                return g;
            }
        }
        return g;
    }
}

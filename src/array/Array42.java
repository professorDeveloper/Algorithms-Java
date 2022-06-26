package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array42
 * Copyright © : 6/24/2022
 */
public class Array42 {
    public static void main(String[] args) {
        array42(new int[]{25, 4, 14, 16, 5, 15}, 10);
    }
    public static void array42(int[] array, int r) {
        int min = Integer.MAX_VALUE;
        int k = 0;
        int na = 0;
        int son1 =0;
        int son2 =0;
        int n = 0;
        for (int i = 1; i < array.length; i++) {
            na = array[k] + array[i];
            n = Math.abs(na - r);
            if (min > n) {
                min = n;
                son1=array[k];
                son2=array[i];
            }
            k++;
        }
        System.out.println(son1);
        System.out.println(son2);
    }
}

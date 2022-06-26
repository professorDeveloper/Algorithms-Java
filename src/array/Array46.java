package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array46
 * Copyright © : 6/25/2022
 */
public class Array46 {
    public static void main(String[] args) {
        array42(new int[]{25, 4, 14, 16, 5, 15}, 30);
    }
    public static void array42(int[] array, int r) {
        int min = Integer.MAX_VALUE;
        int k = 0;
        int na = 0;
        int son1 =0;
        int son2 =0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {//
            for (int j = i+1; j < array.length-1 ; j++) {
                na = array[i] + array[j];//k0
                n = Math.abs(na - r);//
                if (min > n) {//
                    min = n;
                    son1=array[j];
                    son2=array[i];
                }

            }
        }
        System.out.println(son1);
        System.out.println(son2);
    }
}
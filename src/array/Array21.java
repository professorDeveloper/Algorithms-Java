package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array21
 * Copyright © : 6/23/2022
 */
public class Array21 {
    public static void main(String[] args) {
        array21(2, 5, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});//3+4+5+6 =18/4 =

    }

    public static void array21(int k, int l, int[] array) {
        int sum = 0;
        double sol = 0;
        for (int i = k; i <= l; i++) {//k=2//
            sum += array[i];//sum =array[2]=3;
            sol = (double) sum / (l - k + 1);
        }
        System.out.println(sol);
    }
}

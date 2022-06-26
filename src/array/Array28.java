package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array28
 * Copyright © : 6/23/2022
 */
public class Array28 {

    public static void main(String[] args) {
        System.out.println(array28(new int[]{44, 1, 5,3,12,6,9}));//44,5,12,9
        System.out.println(array28(new int[]{44, 1, 5,3,12,6,1}));//44,5,12,1
    }

    public static int array28(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if(array[i]<min) min=array[i];
        }
        return min;
    }
}

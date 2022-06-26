package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array48
 * Copyright © : 6/25/2022
 */
public class Array48 {
    public static void main(String[] args) {
        array48(new int[]{1, 3, 2, 3, 4, 4, 3,2,3,3});
        array48(new int[]{1,3,2,4,3,4,5,3,4,4});
        array48(new int[]{1,2,3,1,2,1,4,1,5,1});

    }
    public static void array48(int[] arrey){

        int counter = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrey.length; i++) {//i0=5....i9=6
            for (int j = i + 1; j < arrey.length-1; j++) {
                if (arrey[i] == arrey[j]) {
                    ++counter;
                }
            }
            if (max<counter){
                max=counter;
            }
            counter=1;
        }
        System.out.println(max+1);
    }
}

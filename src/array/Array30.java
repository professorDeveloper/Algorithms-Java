package array;



/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array30
 * Copyright © : 6/23/2022
 */
public class Array30 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,5,7,2,33,12};
        solution(array);
    }

    /*
     5 8 9 2 3 4 1 0 -3 7
        9 4 1 0
        4
    * */
    public static void solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}

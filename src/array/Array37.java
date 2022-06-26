package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array37
 * Copyright © : 6/23/2022
 */
public class Array37 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

        // 5
        System.out.println(solution(array));
    }


    public static int solution(int[] array) {
        // Local maximum ->  a[i-1] < a[i] && a[i] > a[i+1]
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            // Local maximum ->  a[i-1] < a[i] && a[i] > a[i+1]
//            1 2 3 4 5 2 3 4 5 9 6 8 5 1 2 3
            if (i != array.length - 1) {
                boolean isLocalMax = array[i - 1] < array[i] && array[i] > array[i + 1];
                if (isLocalMax) {
                    counter++;
                }
            } else {
                if (array[i] > array[i - 1]) counter++;
            }
        }
        return counter;
    }
}

package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array47
 * Copyright © : 6/25/2022
 */
public class Array47 {
    public static void main(String[] args) {
        int[] test1 = {1,2,4,5,6,5,3,2,1,7,8,2,};
        solution(test1);
    }


    //    7 4 2	3 1	4 5	2 4 7
    //    7
    public static void solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i]; // i=5; element=4
            boolean mavjud = false; //
            for (int j = 0; j < i; j++) {
                mavjud = mavjud || element == array[j];
            }
            if (!mavjud) {
                System.out.println(element + " soni " + counter(element, array) + " ta");
            }// 7 4 2 3 1
        }
    }

    public static int counter(int element, int[] array) {
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            if (element == array[j]) counter++;
        }
        return counter;
    }
}

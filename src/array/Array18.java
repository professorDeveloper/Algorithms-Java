package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array18
 * Copyright © : 6/23/2022
 */
public class Array18 {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 4, 2, 3, 1, 6, 5, 1};
        System.out.println(solution(array));
    }

    // eng oxirgi elementidan kichik birinchi element topilsin
    // 3 5 1 4 2 3 1 6 5 3 -> 1
    public static int solution(int[] array) {
        int last = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < last) {// topildi
                return array[i];
            }
        }
        return 0;
    }
}

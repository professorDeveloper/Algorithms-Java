package array;

//import array.util.ArrayUtil;

import java.util.Scanner;

public class Array1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            // 0 - 1
            // 1 - 3
            // 2 - 5
            // 3 - 7
            // 4 - 9
            // 5 - 11
            arr[i] = i * 2 + 1; // 1 3 5 7 9 11 13 ...
        }
//        ArrayUtil.show(arr);
    }

}

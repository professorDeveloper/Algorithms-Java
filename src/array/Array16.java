package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Date -> 6/22/2022/ 1:40 AM
 */
public class Array16 {
    public static void main(String[] args) {
        int[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9};//9/2 4 -> 5
        int[] r1 = {3, 21, 13, 14, 52, 67, 79, 18, 90};//9/2 4 -> 5
        //index    0  1  2  3  4  5  6  7 8
        array16(r);
        array16(r1);
    }

    public static void array16(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {//4 -> 5
            //9/2 =4.5
            System.out.print(array[i] + " ");// i0-1;i1-2;i2-3;i3-4;
            System.out.print(array[array.length - i - 1] + " ");//i8-9:i7-8:i6-7: i5-6;
        }
        if (array.length % 2 != 0) { //true
            System.out.println(array[array.length / 2]);//i4-5;
        }

    }
}

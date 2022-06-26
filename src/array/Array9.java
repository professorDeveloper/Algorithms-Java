package array;

public class Array9 {
    public static void main(String[] args) {
        int[]array={2,3,4,5,6,7,8,9,13,10};
        array9(array);
    }

    public static void array9(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}



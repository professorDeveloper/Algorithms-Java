package array;

public class Array8 {
    public static void main(String[] args) {
        int[]array={2,3,4,5,6,7,8,9,13,6,8,10,};
        array8(array);
    }

    public static void array8(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}

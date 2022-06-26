package array;

public class Array10 {

    public static void main(String[] args) {
//        int[] arr = new int[10];
        int[] arr = {10, 13, 26, 21, 19, 1, 2, 8, 14, 19};
        solution(arr);
    }

    // 10 13 26 21 19 1 2 8 14 19
    // 10 26 2 8 14 19 1 19 21 13
    public static void solution(int[] array) {
        // faqat juftlari. Indexlari o'sish tartibida
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.print(array[i] + "\t");
        }

        // faqat taqlari. Indexlari kamayish tartibida
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 1)
                System.out.print(array[i] + "\t");
        }

    }
}

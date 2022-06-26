package array;


public class Array7 {
    public static void main(String[] args) {
        array7(new int[]{1,2,3,4,5,6,7,8});
    }
    public static void array7(int[] array) {

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+"\t");


        }
    }
}

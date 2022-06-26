package array;



public class Array3 {
    public static void main(String[] args) {
        Progressiya(3, 8,1);//
    }

    public static void Progressiya(int d, int n ,int a) {
        int[] array = new int[n];
         a = array[0];

//        array.length=n
        for (int i = a; i <= n-1; i++) {//a1+(d*n-1)
            array[i] = array[0] + i * d;

        }
//        ArrayUtil.show(array);
    }
}

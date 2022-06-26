package array;


public class Array6 {
    public static void main(String[] args) {
        array6(5,4, new int[]{4,5,6,7,8,9,10});
    }
    public static void array6(int a,int b,int []array){
        array[0]=a;
        array[1]=b;

        for (int i = 2; i < array.length; i++) {
            array[i]=0;
            for (int j = 0; j <i ; j++) {
                array[i]+=array[j];
            }
        }
    }
}

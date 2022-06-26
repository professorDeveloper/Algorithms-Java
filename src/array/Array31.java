package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array31
 * Copyright © : 6/23/2022
 */
public class Array31 {
    public static void main(String[] args) {
        array31(new int[]{1,2,3,4,5});
    }
    public static void array31(int []array){
        int num=0;
        for (int i = array.length-1; i >=1; i--) {
            if (array[i-1]<array[i]) {
                System.out.print(i+1+" ");
                num++;
            }
        }
        System.out.println();
        System.out.println("Soni: "+num);
    }
    
}

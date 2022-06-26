package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array41
 * Copyright © : 6/24/2022
 */
public class Array41 {
    public static void main(String[] args) {

    }

    public static void array41(int[] array) {
        int summax = array[0] + array[1], k = 1;
        for (int i = 2; i < array.length; i++) {
            if (array[i-1]+array[i]>summax){
                summax=array[i-1]+array[i];
                k=i;
            }

        }
System.out.printf("%d,%d",array[k-1],array[k]);
    }
}

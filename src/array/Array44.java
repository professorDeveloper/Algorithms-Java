package array;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> array
 * Class Name -> Array44
 * Copyright © : 6/24/2022
 */
public class Array44 {
    public static void main(String[] args) {
        solution(new int[]{3,4,3,7,4});
    }

    //3,4,3,7,7;
    //3,3;
    public static void solution(int[]arrey) {
        int index1,index2;
        for(int i=0; i<arrey.length; i++){//i0=5....i9=6
            for (int j = i+1; j < arrey.length; j++) {
                if(arrey[i]==arrey[j]) {
                    index1=i;//i0
                    index2=j;//i2 i4
                    System.out.print(index1+"->"+index2+";");


                }

            }
        }

}
}

package fori;

public class forexample {
    public static void main(String[] args) {
        // [x^0 + x^1 + x^2 + x^3 + ... x^n]
         int sum = 0;
        int  n=7, x = 2;
        // [2^0 + 2^1 + 2^2 + 2^3 + 2^4 + 2^5 + 2^7 + 2^7]

        for (int i = 0 ; i<= n; i++) {
            int powerSum = 1;

            for (int j = 0; j < i; j++) {
                powerSum *= x;
            }
            //System.out.print(powerSum +" ");
            sum += powerSum;
        }

        System.out.println(sum);





    }
}

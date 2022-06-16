package minmax;

import java.util.Scanner;

public class MinMax20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int counterMax=0;
        int counterMin=0;
        int r;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+".");
            r= scanner.nextInt();
            //
            if ((r < min) || (i == 1)) {
                min = r;
                counterMin = 0;
            }
            //
            if ((r > max) || (i == 1)) {
                max = r;
                counterMax = 0;
            }
            //
            if (r == min) {
                ++counterMin;
            } else if (r == max)
                ++counterMax;
            //
    }
        System.out.println(counterMax+counterMin);/*
         Eksteremal elementligi uchun: (counterMax +counterMin) Ekstremal element deb eng katta yoki eng kichik elemntga aytiladi
         */

}
}

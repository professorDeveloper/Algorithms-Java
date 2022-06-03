package fori;

import java.util.Scanner;

public class for27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double X;
        System.out.print("Raqamni kiriting X (|X|<1): ");
        X = scanner.nextDouble();
        int N;
        System.out.print("Raqamni kiriting N (>0): ");
        N = scanner.nextInt();
        double answer;
        double z; //
        double h;
        double stepen;
        z = stepen = 1;
        h = X;
        answer = X;
        for (int i = 1; i <= N ;i++)
        {
            h = h * X * X; // x^3 / x^5 /x^7
            stepen = stepen * (2 * i - 1); // stepen= 1 / 3 / 15
            z = z * (i * 2 + 1) * (i * 2); // 6  / 40
            answer += (stepen * h) / z; // (1*x^3)/6
            z = z / (i * 2 + 1); // 2   / 8x
        }
        System.out.printf("Javob: %.2f",answer);


    }
}

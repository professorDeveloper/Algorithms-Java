package ifdirect;

import java.util.Scanner;

public class if5 {
    public static void main(String[] args) {
        int a, b, c, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-son:");
        a = scanner.nextInt();
        System.out.println("2-son:");
        b = scanner.nextInt();
        System.out.println("3-son:");
        c = scanner.nextInt();

        if (a >= 0) count++;
        if (b >= 0) count++;
        if (c >= 0) count++;
        int counts = 0;
        if (a<0) counts++;
        if (b<0) counts++;
        if (c<0) counts++;
        System.out.printf("Musbatlar soni: %d\n", count);
        System.out.printf("Manfiylar soni: %d", counts);
    }
    }

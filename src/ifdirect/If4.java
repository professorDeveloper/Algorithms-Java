package ifdirect;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, counter = 0;
        System.out.println("Sonlarni kiriting:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a >= 0) counter++;
        if (b >= 0) counter++;
        if (c >= 0) counter++;

        System.out.printf("Musbarlar soni: %d", counter);

//        System.out.println("Musbarlar soni: " + counter);
    }
}

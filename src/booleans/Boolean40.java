package booleans;

import java.util.Scanner;

public class Boolean40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1..8 dagi x va y ni kiriting: ");
        System.out.println("Dastlabki koordinatasi");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.println("Ko'chgan koordinatasi");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        boolean isBlack = Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2 ||
                Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1;

        System.out.println("Otning yurishi: " + isBlack);

    }
}

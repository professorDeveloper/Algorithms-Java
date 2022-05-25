package swichcase;


import java.util.Scanner;

public class switch10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char y = scanner.next().charAt(0); // belgini kiritish
        int k = scanner.nextInt();

        // test1 : q 2
        solution(y, k);
    }

    // char y - yo'nalish
    // s - shimol, j-janub, q-sharq, g-g'arb
    // int k - komanda :
    // 0 - harakatni davam ettir
    // 1 - chapga burilish
    // 2 - o'ngga burilish
    public static void solution(char y, int k) {
        // y='q' k=1 -> shimol
        String result = "";
        String north = "shimol";
        String south = "janub";
        String sharq = "sharq";
        String garb = "g'arb";

        switch (k) {//davom ettir
            case 0 -> {
                switch (y) {
                    case 's' -> result = north;
                    case 'j' -> result = south;
                    case 'q' -> result = sharq;
                    case 'g' -> result = garb;
                }
            }
            case 1 -> { // chapga
                switch (y) {
                    case 's' -> result = garb;
                    case 'j' -> result = sharq;
                    case 'q' -> result = north;
                    case 'g' -> result = south;
                }
            }
            case 2 -> { // o'ngga
                switch (y) {
                    case 's' -> result = sharq;
                    case 'j' -> result = garb;
                    case 'q' -> result = south;
                    case 'g' -> result = north;
                }
            }
        }
        System.out.println(result);
    }
}


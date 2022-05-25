package integer;

import java.util.Scanner;

public class integer24 {
    public static void main(String[] args) {
        // 1-yanvar dushanba
        // 1-du, 2-se,3-ch 4-pa, 5-ju 6-sha 7-ya; 8-du 9-se
        System.out.println("1-yanvar dushanba");
        Scanner scanner = new Scanner(System.in);
        System.out.print("K kiriting: ");
        int a = scanner.nextInt(); // 15->1; 13->6; 130->??
        int result = a % 7;//nega 7
        // sabab:

        System.out.println(result); // 6
    }
}

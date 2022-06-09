package minmax;

import java.util.Scanner;

public class MinMax9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // sonlar miqdori
        int maxFirstIndex = 1;
        int maxLastIndex = 1;
//        System.out.print("1-");
        int max = scanner.nextInt(); // 1-son (eng kattasi shu bo'lsa kerak, 1-si ham oxirgi uchragani ham)
        for (int i = 2; i <= n; i++) {
//            System.out.print(i + "-");
            int a = scanner.nextInt();

            if (max < a) {   // 5 10 2 9 0 10 6 10
                max = a;     //10
                maxFirstIndex = i; //2
            }
            if (max <= a) {   // 5 10 2 9 0 10 6
                maxLastIndex = i;
            }
            // max <= a -> oxirgi uchragan eng katta
            // max < a  -> 1-uchragan eng katta
        }
        System.out.println(maxFirstIndex); // 1-uchragan eng son
        System.out.println(maxLastIndex);  // oxirgi uchragan eng son
    }
}

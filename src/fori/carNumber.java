package fori;
public class carNumber {
    public static void main(String[] args) {
        tashkentNumbers("01 X B0B XX", 8.5);
    }


    // 01 A 001 AA
    // 01 A 002 AA
    // 01 A 999 AA
    // 01 A 000 AB
    // 01 A 000 BA
    // 01 A 999 ZZ
    // 01 B 000 AA
    // 01 Z 999 ZZ
    // 02 A 000 AA

    public static void tashkentNumbers(String pattern, double cost) {
        // 01 A 010 AA
        // 10*26*10*10*10*26*26
        // 1.1 - 000 ... 009
        // 1.2 - 000 ... 090
        // 1.3 - 000 ... 900
        // 2 - oxirgi harf A..Z
        // 3 - oxirgidan oldingisi harf A..Z
        // 4 - dastlabki harf A..Z
        // 5 - 01 .. 09

        int counter = 0;
        // 01 A B0B AA  8 mln
        // 25*10 * 8 mln

        // 01 A 101 AA // 8 mln
        for (int i = 1; i <= 9; i++) {
            for (char j = 'A'; j <= 'Z'; j++) {//4-si
                for (char k = 'A'; k <= 'Z'; k++) {//3-si
                    for (char l = 'A'; l <= 'Z'; l++) { // 2-si
                        for (int m = 0; m <= 9; m++) { //1- 000 999
                            for (int n = 0; n <= 9; n++) {
                                for (int o = 0; o <= 9; o++) {
                                    // 01 A 000 AA
                                    // 0%d %c %d%d%d %c%c
//                                    System.out.printf("");
                                    // 0i j mno kl

                                    if (i == 1 && m == o && j == k && k == l && n == 0) {
                                        System.out.println("0" + i + " " + j + " " + m + "" + n + "" + o + " " + k + "" + l);
                                        counter++;
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter*cost+" mln");
    }
}


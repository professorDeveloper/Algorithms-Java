public class Case8 {
    public static void main(String[] args) {
        function(1, 3);   // test1
        function(31, 3);  // test2
        function(31, 4);  // test3
        function(29, 2);  // test3
    }

    // case8  masalaning yechimi ushbu funksiyada yechiladi
    // kabisa bo'lmagan yil sanasi
    // 12 3 -> 12-mart
    // 32 3 -> bunday kun mavjud emas
    // 1 13 -> bunday kun mavjud emas
    // 29 2 -> bunday kun mavjud emas
    // 31 4 -> bunday kun mavjud emas
    // 30 2 -> bunday kun mavjud emas
    // avvalo mantiqan to'g'ri qiymatlar aniqlab olinadi
    // kun 1..31
    // oy  1..12
    // 12 3
    //2 3
    public static void function(int day, int month) {
//  day < 1 || day > 31 || month < 1 || month > 12
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("bunday kun mavjud emas");
        } else {
            //albatta day 1..31,  month 1..12
            switch (month) {
                case 1 -> System.out.println(day + "-yanvar");
                case 3 -> System.out.println(day + "-mart");
                case 5 -> System.out.println(day + "-may");
                case 7 -> System.out.println(day + "-iyul");
                case 8 -> System.out.println(day + "-avgust");
                case 10 -> System.out.println(day + "-oktyabr");
                case 12 -> System.out.println(day + "-dekabr");
                case 2 -> {
                    if (day <= 28)
                        System.out.println(day + "-fevral");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 4 -> {
                    if (day < 31) System.out.println(day + "-aprel");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 6 -> {
                    if (day < 31) System.out.println(day + "-iyun");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 9 -> {
                    if (day < 31) System.out.println(day + "-sentyabr");
                    else System.out.println("bunday kun mavjud emas");
                }
                case 11 -> {
                    if (day < 31) System.out.println(day + "-noyabr");
                    else System.out.println("bunday kun mavjud emas");
                }

            }
        }
    }

    public static void case1(){

    }
}

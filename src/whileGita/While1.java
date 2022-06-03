package whileGita;

public class While1 {

    public static void main(String[] args) {
        System.out.println(solution(100, 7)); // 1
    }

    // a > b
    public static int solution(int a, int b) {
       int counter = 0;
        while (a > b) {
            a -= b;
            counter++;
        }
        System.out.println(counter+" marta bajarildi");
        return a;
    }
}

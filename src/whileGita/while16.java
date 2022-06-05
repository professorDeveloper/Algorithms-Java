package whileGita;

public class while16 {
    public static void main(String[] args) {
solution(5);
    }
    public static void solution( int p) {
        int k = 1;
        float d = 10F;
        float s = 10F;
        while (s <= 200F)
        {
            ++k;
            d += d * p / 100;
            s += d;
        }
        System.out.print("Kunlar Soni:");
        System.out.print(k);
        System.out.print("\n");
        System.out.print("Masofa:");
        System.out.print(s);
    }

}

import java.util.Scanner;

public class integer28 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n;
        int k;
        int natija;
        System.out.println("1-yanvar :");
        n= scanner.nextInt();//
        System.out.println("1..365 K :");
        k= scanner.nextInt();//7  2 seshanba
        natija=(k+n-2)%7+1;//
        System.out.println("Natija: "+natija);
    }
}

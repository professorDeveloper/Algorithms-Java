package masalaGita80;

import java.util.Scanner;

public class if12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt(); // berilgan son
        int b = scanner.nextInt(); // berilgan son
        int c = scanner.nextInt();

        if (a < b) { // a katta b dan
            if (a < c) { // a katta c da
                System.out.println("Kichik son a = " + a);
            } else {

                if (b<a){
                    System.out.println("Kichik son b = " + a);

                }else if (b<c){
                    System.out.println("Kichik son b = " + a);

                }

                    // c katta a dan
            }
        }

        else { // a kichik b dan (b katta a dan)
            if (b > c) { // b katta c dan
                System.out.println("Kichik son c = " + c);
            } else if (c<a){ // b kichik c da
                System.out.println("Kichik son c = " + c);
            }
        }

    }
}

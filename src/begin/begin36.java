package begin;

import java.util.Scanner;

public class begin36 {
    public static void main(String [] args) {

        Scanner scanner=new Scanner(System.in);
        int v1;
        int v2;
        int l;
        int s;
        int t;
        System.out.print("T Vaqt=");
        t = scanner.nextInt();
        v1 = 20;
        v2 = 30;
        s = 60;
        l = t * (v1 + v2) + s;
        System.out.print("Ular Orasidagi Masofa =");
        System.out.print(l);

    }
}

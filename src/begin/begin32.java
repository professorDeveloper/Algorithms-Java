package begin;

import java.util.Scanner;

public class begin32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Tc;
        int Tf;
        System.out.print("Tf=");
        Tf = scanner.nextInt();
        Tc = (Tf - 32) * 5 / 9;
        System.out.println("Tc="+Tc);
    }
}

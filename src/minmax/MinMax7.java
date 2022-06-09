package minmax;

import java.util.Scanner;

public class MinMax7 {
    public static void main(String[] args) {

        int n;
        int minnum=0;
        int maxnum=0;
        int r;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Scanner scanner=new Scanner(System.in);
        System.out.println("N:");
        n=scanner.nextInt();
        for (int i = 1;i <= n;++i)
        {
            System.out.print(i+"-");
            r= scanner.nextInt();
            if ((i == 1) || (r > max))
            {
                max = r;
                maxnum = i;
            }
            if ((i == 1) || (r <= min))
            {
                min = r;
                minnum = i;
            }
        }
        System.out.println("Birinchi uchragan Eng Katta :"+maxnum+"- tartib raqamda joylashgan");
        System.out.println("Oxirgi  uchragan Eng kichik :"+minnum+"- tartib raqamda joylashgan");

    }

}

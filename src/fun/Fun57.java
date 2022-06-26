package fun;

public class Fun57 {
    public static void main(String[] args) {
        System.out.println (Perim (1, 2, 1, 2, 3, 2));
    }
    public static double Perim(double xa,double ya, double xb,double yb,double xc,double yc){
      double a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
      double b = Math.sqrt((xb-xc) * (xb-xc) + (yb-yc) * (yb-yc));
      double c = Math.sqrt((xc - xa) * (xc - xa) + (yc - ya) * (yc - ya));
      double p = (a + b + c) / 2;

      return p;
    }

}

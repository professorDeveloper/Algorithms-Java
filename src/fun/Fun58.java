package fun;

public class Fun58 {
    public static void main(String[] args) {
        System.out.printf ("%.2f",Area (1, 2, 3, 4, 5, 6));
    }
    public static double Area(double xa,double ya, double xb,double yb,double xc,double yc){
        double p=Perim(xa,ya,xb,yb,xc,yc);
        double a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
        double b = Math.sqrt((xb-xc) * (xb-xc) + (yb-yc) * (yb-yc));
        double c = Math.sqrt((xc - xa) * (xc - xa) + (yc - ya) * (yc - ya));

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static double Perim(double xa,double ya, double xb,double yb,double xc,double yc){
        double a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
        double b = Math.sqrt((xb-xc) * (xb-xc) + (yb-yc) * (yb-yc));
        double c = Math.sqrt((xc - xa) * (xc - xa) + (yc - ya) * (yc - ya));
        double p = (a + b + c) / 2;

        return p;
    }
}

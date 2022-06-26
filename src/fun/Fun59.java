package fun;

public class Fun59 {
    public static void main(String[] args) {
        System.out.println(dist(-5, 5, 7, 7, 3, 5.5));
    }


    public static double dist(double xa, double ya, double xb, double yb, double xp, double yp) {
        double h, a, b, c, s, p;
        a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
        b = Math.sqrt((xp - xb) * (xp - xb) + (yp - yb) * (yp - yb));
        c = Math.sqrt((xa - xp) * (xa - xp) + (ya - yp) * (ya - yp));
        p = Perim(xa, ya, xb, yb, xp, yp);
        s = Area(xa,ya,xb,yb,xp,yp);
        h = 2 * s / a;
        return h;
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

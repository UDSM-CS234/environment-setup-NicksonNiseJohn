public class Position {
    private double a, vi, xi, t;
     double Position(double acc, double time, double intialV, double intialp)  {
        a = acc;
        t = time;
        vi = intialV;
        xi = intialp;
        return 0.5 * a*t*t + vi*t + xi;
    }

    public static void main(String[] args) {
         Position y = new Position();
        double x = y.Position(-9.81,10,0,0);
        System.out.println(x);
    }
}

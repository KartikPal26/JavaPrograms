import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
    static double volumeOfCone(double r,double h){
        return (1/3)*Math.PI*r*r*h;
    }
    static double volumeOfPrism(double b,double h){ return (1/2)*b*h*h; }
    static double volumeOfCylinder(double r,double h){ return Math.PI*r*r*h; }
    static double volumeOfSphere(double r,double h){ return (4/3)*Math.PI*r*r*r; }
    static double surfaceAreaOfCylinder(double r,double h){ return (2*Math.PI*r*h + 2*Math.PI*r*r );}
    static double totalSurfaceAreaOfCube(double a){ return 6*a; }


}

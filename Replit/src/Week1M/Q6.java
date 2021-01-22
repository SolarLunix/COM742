package Week1M;

/**
 * Design a program to calculate the volume of spheres and cylinders
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M:Q6
 */
public class Q6 {
    public static void main(String[] args) {
        System.out.println(String.format("Sphere Diameter 10 has a volume of %.3f", volumeSphere(10)));
        System.out.println(String.format("Cylinder Diameter 10 height 10 has a volume of %.3f", volumeCylinder(10, 10)));
    }

    public static double volumeSphere(double d){
        return Math.pow(d, 3) * Math.PI / 6;
    }

    public static double volumeCylinder (double d, double h){
        return Math.PI * Math.pow(d, 2) * h / 4;
    }
}

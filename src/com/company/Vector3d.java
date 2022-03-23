package com.company;

public class Vector3d{

    double x,y,z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lengthCalc() {
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));

    }

    public static double dotProdCalc(Vector3d vector3d1, Vector3d vector3d2) {
        return ((vector3d1.x*vector3d2.x)+(vector3d1.y*vector3d2.y)+(vector3d1.z*vector3d2.z));

    }

    public static String sumCalc(Vector3d vector3d1, Vector3d vector3d2) {
        double a = vector3d1.x + vector3d2.x;
        double b = vector3d1.y + vector3d2.y;
        double c = vector3d1.z + vector3d2.z;
        return "<" + a + ", " + b + ", " + c + ">";

    }

    public static String substactCalc(Vector3d vector3d1, Vector3d vector3d2) {
        double a = vector3d1.x - vector3d2.x;
        double b = vector3d1.y - vector3d2.y;
        double c = vector3d1.z - vector3d2.z;
        return "<" + a + ", " + b + ", " + c + ">";
    }

    public static void vectorCompare(Vector3d vector3d1, Vector3d vector3d2) {
        if ((vector3d1.x + vector3d1.y + vector3d1.z - (vector3d2.x + vector3d2.y+ vector3d2.z))>0)
            System.out.println("vector3d1 > vector3d2");
        else
            System.out.println("vector3d1 < vector3d2");

    }
}

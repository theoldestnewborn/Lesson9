package com.company;

public class Vector3d implements Calculations{

    double x,y,z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double lengthCalc() {
        double vectorLength = Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        return vectorLength;
    }

    @Override
    public double dotProdCalc() {
        return;
    }

    @Override
    public double sumCalc() {
        return;
    }

    @Override
    public double substactCalc() {
        return;
    }
}

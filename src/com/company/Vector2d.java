package com.company;

public class Vector2d implements Calculations{

    double x,y;
    public Vector2d (double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public double lengthCalc() {
        double vectorLength = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return vectorLength;
    }

    @Override
    public double dotProdCalc(vector2d1) {
         double dotProd = (vector2d1.)
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

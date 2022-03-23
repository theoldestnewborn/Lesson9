package com.company;

import javax.swing.*;

public class Vector2d {

    double x, y;

    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void lengthCalc() {
        System.out.println("Длина вектора - " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public static void getScalar(Vector2d vector2d1, Vector2d vector2d2) {
        System.out.println("Скалярное произведение - " + vector2d1.getX() * vector2d2.getX() +
                vector2d1.getY() * vector2d2.getY());
    }

    public static void sumCalc(Vector2d vector2d1, Vector2d vector2d2) {
        double a = vector2d1.x + vector2d2.x;
        double b = vector2d1.y + vector2d2.y;
        System.out.println("Сумма векторов - " + "<" + a + ", " + b + ">");
    }

    public static void substactCalc(Vector2d vector2d1, Vector2d vector2d2) {
        double a = vector2d1.x - vector2d2.x;
        double b = vector2d1.y - vector2d2.y;
        System.out.println("Разность векторов - " + "<" + a + ", " + b + ">");
    }

    public static void vectorCompare(Vector2d vector2d1, Vector2d vector2d2) {
        if ((vector2d1.x + vector2d1.y - (vector2d2.x + vector2d2.y)) > 0)
            System.out.println("vector2d1 > vector2d2");
        else
            System.out.println("vector2d1 < vector2d2");
    }

    public static Vector2d[] vectorArray(int n) {
        Vector2d [] VectorsArray = new Vector2d[n];
        for (int i = 0; i < n; i++) {
            VectorsArray[i] = new Vector2d( Math.random() * 30,Math.random() * 20);
        }
        return VectorsArray;
    }
}

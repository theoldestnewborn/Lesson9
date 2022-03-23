package com.company;


public class Main {

    public static void main(String[] args) {
        Vector2d vector2d1 = new Vector2d(4.0, 8.0);
        Vector2d vector2d2 = new Vector2d(3.5, 4.1);
        Vector3d vector3d1 = new Vector3d(3.0, 7.3, 2.6);
        Vector3d vector3d2 = new Vector3d(1.5, 0.2, 9.2);

        vector2d1.lengthCalc();
        vector2d2.lengthCalc();
        Vector2d.sumCalc(vector2d1,vector2d2);
        Vector2d.getScalar(vector2d1,vector2d2);
        Vector2d.substactCalc(vector2d1,vector2d2);
        System.out.println();

        System.out.println("Длина векторов - " + vector3d1.lengthCalc() + " , " + vector3d2.lengthCalc());
        System.out.println("Скалярное произведение - " + Vector3d.dotProdCalc(vector3d1, vector3d2));
        System.out.println("Сумма векторов - " + Vector3d.sumCalc(vector3d1, vector3d2));
        System.out.println("Разность векторов - " + Vector3d.substactCalc(vector3d1, vector3d2));

        Vector2d.vectorCompare(vector2d1,vector2d2);
        Vector3d.vectorCompare(vector3d1, vector3d2);

        vector2d1.getInfo();
        vector3d2.getInfo();

        Vector2d.vectorArray(1);

    }
}

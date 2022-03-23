package com.company;

public interface Calculations {
    double lengthCalc();
    double dotProdCalc ();
    double sumCalc ();
    double substactCalc ();


}

//        - метод, вычисляющий скалярное произведение; a*b*c+a1*b1*c1
//        - метод сложения векторов; <a+a1, b+b1, c+c1>
//        - метод разности векторов; <a-a1, b-b1, c-c1>
//  vec1.a*vec2.a + vec1.b * vec2.b
// vec1.a*vec2.a*vec3.a + vec1.a*vec2.a*vec3.a